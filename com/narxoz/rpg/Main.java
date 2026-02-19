package com.narxoz.rpg;

import com.narxoz.rpg.builder.BossEnemyBuilder;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.factory.FireComponentFactory;
import com.narxoz.rpg.factory.EnemyComponentFactory;
import com.narxoz.rpg.prototype.EnemyRegistry;

public class Main {

    public static void main(String[] args) {

        EnemyComponentFactory factory =
                new FireComponentFactory();

        Enemy fireDragon = new BossEnemyBuilder()
                .setName("Fire Dragon")
                .setHealth(50000)
                .setDamage(800)
                .setLootTable(factory.createLootTable())
                .setAI(factory.createAIBehavior())
                .addAbility(factory.createAbilities().get(0))
                .build();

        
        EnemyRegistry registry = new EnemyRegistry();
        registry.registerTemplate("dragon", fireDragon);

        Enemy eliteDragon =
                registry.createFromTemplate("dragon");

        System.out.println("Original: " + fireDragon.getName());
        System.out.println("Clone: " + eliteDragon.getName());
    }
}
