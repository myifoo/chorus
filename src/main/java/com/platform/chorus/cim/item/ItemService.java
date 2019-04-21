package com.platform.chorus.cim.item;

import com.platform.chorus.db.tables.ItemValue;
import com.platform.chorus.db.tables.pojos.ItemEntity;

import java.util.List;

public interface ItemService {
    Integer createItemEntity(ItemEntity entity);
    List<Integer> createItemEntity(List<ItemEntity> entities);
    Integer createItemValue(ItemValue value);
    List<Integer> createItemValue(List<ItemValue> values);
}
