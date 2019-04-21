package com.platform.chorus.cim.item;

import com.platform.chorus.cim.Service;
import com.platform.chorus.db.tables.pojos.ItemValue;
import com.platform.chorus.db.tables.pojos.ItemEntity;

import java.util.List;

public interface ItemService extends Service {
    Integer createItemEntity(ItemEntity entity);
    List<Integer> createItemEntity(List<ItemEntity> entities);
    ItemValue createItemValue(ItemValue value);
    List<ItemValue> createItemValue(List<ItemValue> values);
}
