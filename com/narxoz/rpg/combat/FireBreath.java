package com.narxoz.rpg.combat;

public class FireBreath implements Ability {

    private final int damage = 120;

    @Override
    public String getName() {
        return "Fire Breath";
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getDescription() {
        return "Dragon breathes fire";
    }

    @Override
    public Ability clone() {
        return new FireBreath();
    }
}

