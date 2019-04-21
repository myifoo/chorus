package com.platform.chorus.cim.item;

import com.platform.chorus.db.neo4j.GraphTemplate;
import com.platform.chorus.db.services.ItemEntityService;
import com.platform.chorus.db.services.ItemValueService;
import com.platform.chorus.db.tables.pojos.ItemValue;
import com.platform.chorus.db.tables.pojos.ItemEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Create by A.T on 2019/4/19
 */
@Component
public class ItemServiceImpl implements ItemService {
    private final static Logger logger = LoggerFactory.getLogger(ItemServiceImpl.class);

    @Autowired
    private ItemEntityService entityService;

    @Autowired
    private ItemValueService valueService;

    @Autowired
    private GraphTemplate template;


    @Override
    public Integer createItemEntity(ItemEntity entity) {
        try {
            entityService.createItemEntity(entity);
        } catch (Exception e) {
            logger.error("create item entity failed: {}, {}", e.getClass().getSimpleName(), e.getMessage());
        }

        createItemNodeRelation(entity);

        return entity.getId();
    }

    @Override
    public List<Integer> createItemEntity(List<ItemEntity> entities) {
        entityService.createItemEntity(entities);
        entities.forEach(this::createItemNodeRelation);

        return entities.stream().map(ItemEntity::getId).collect(Collectors.toList());
    }

    private void createItemNodeRelation(ItemEntity entity) {
        String itemId = buildItemNodeId(entity.getType(), entity.getName());

        try {
            template.createNode(itemId,
                    String.format("{name:'%s', type:'%s', creator:'%s'}",
                            entity.getName(),
                            entity.getType(),
                            entity.getCreator())
            );

            template.createRelation(buildClassNodeId(entity.getType()), itemId, INSTANCE);
        } catch (Exception e) {
            logger.error("create item node and relation failed: {}, {}", e.getClass().getSimpleName(), e.getMessage());
        }

        try {
            entityService.fetchById(entity.getContains()).forEach(e->{
                template.createRelation(
                        buildItemNodeId(entity.getType(), entity.getName()),
                        buildItemNodeId(e.getType(), e.getName()),
                        CONTAIN);
            });
        } catch (Exception e) {
            logger.error("fetch entities failed: {}, {}", e.getClass().getSimpleName(), e.getMessage());
        }
    }

    @Override
    public ItemValue createItemValue(ItemValue value) {
        return valueService.createItemValue(value);
    }

    @Override
    public List<ItemValue> createItemValue(List<ItemValue> values) {
        return valueService.createItemValue(values);
    }
}
