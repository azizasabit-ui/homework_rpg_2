package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

import java.util.ArrayList;
import java.util.List;

public class Enemy {

    private final String name;
    private final int health;
    private final int damage;
    private final List<Ability> abilities;
    private final LootTable lootTable;
    private final String ai;

    public Enemy(String name,
                 int health,
                 int damage,
                 List<Ability> abilities,
                 LootTable lootTable,
                 String ai) {

        this.name = name;
        this.health = health;
        this.damage = damage;
        this.abilities = abilities;
        this.lootTable = lootTable;
        this.ai = ai;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getDamage() { return damage; }
    public List<Ability> getAbilities() { return abilities; }
    public LootTable getLootTable() { return lootTable; }
    public String getAi() { return ai; }

    public Enemy clone() {

        List<Ability> clonedAbilities = new ArrayList<>();
        for (Ability a : abilities) {
            clonedAbilities.add(a.clone());
        }

        LootTable clonedLoot = lootTable != null ? lootTable.clone() : null;

        return new Enemy(name, health, damage,
                clonedAbilities, clonedLoot, ai);
    }
}
