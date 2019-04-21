package com.platform.chorus.db.services;

import com.platform.chorus.db.tables.pojos.ItemEntity;

import java.util.List;

public interface ItemEntityService {
    Integer createItemEntity(ItemEntity entity);
    List<Integer> createItemEntity(List<ItemEntity> entities);
}
