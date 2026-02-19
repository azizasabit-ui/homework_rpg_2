package com.narxoz.rpg.builder;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

import java.util.ArrayList;
import java.util.List;

public abstract class EnemyBuilder {

    protected String name;
    protected int health;
    protected int damage;
    protected List<Ability> abilities = new ArrayList<>();
    protected LootTable lootTable;
    protected String ai;

    public EnemyBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EnemyBuilder setHealth(int health) {
        this.health = health;
        return this;
    }

    public EnemyBuilder setDamage(int damage) {
        this.damage = damage;
        return this;
    }

    public EnemyBuilder addAbility(Ability ability) {
        abilities.add(ability);
        return this;
    }

    public EnemyBuilder setLootTable(LootTable lootTable) {
        this.lootTable = lootTable;
        return this;
    }

    public EnemyBuilder setAI(String ai) {
        this.ai = ai;
        return this;
    }

    // FACTORY METHOD
    public abstract com.narxoz.rpg.enemy.Enemy build();
}
