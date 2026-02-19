package com.narxoz.rpg.loot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FireLootTable implements LootTable {

    private final List<String> items =
            new ArrayList<>(Arrays.asList("Fire Gem", "Dragon Scale"));

    @Override
    public List<String> getItems() {
        return new ArrayList<>(items);
    }

    @Override
    public int getGold() {
        return 5000;
    }

    @Override
    public int getExperience() {
        return 10000;
    }

    @Override
    public LootTable clone() {
        return new FireLootTable();
    }
}
