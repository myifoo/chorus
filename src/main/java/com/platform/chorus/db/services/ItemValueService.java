package com.platform.chorus.db.services;

import com.platform.chorus.db.tables.pojos.ItemValue;

import java.util.List;

public interface ItemValueService {
    ItemValue createItemValue(ItemValue value);
    List<ItemValue> createItemValue(List<ItemValue> values);
}
