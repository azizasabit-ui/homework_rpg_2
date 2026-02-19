package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.Enemy;

public class BossEnemyBuilder extends EnemyBuilder {

    @Override
    public Enemy build() {

        if (name == null || health <= 0) {
            throw new IllegalStateException(
                    "Enemy must have name and health!"
            );
        }

        return new Enemy(name, health, damage,
                abilities, lootTable, ai);
    }
}

