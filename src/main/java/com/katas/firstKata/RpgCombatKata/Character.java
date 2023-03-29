package com.katas.firstKata.RpgCombatKata;

public class Character {

    private Long health = 1000L;
    private Long level = 1L;
    private Boolean isAlive = true;

    public Long getHealth() {
        return this.health;
    }

    public Long getLevel() {
        return this.level;
    }

    public Boolean getIsAlive() {
        return isAlive;
    }


    public Long setHealth(Long health) {
        this.health = health;
        return health;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public void attacks(Character victim, Character villain, Long damage,Long health) {
        victim.damage(victim, villain, damage, health);
    }

    private Long damage(Character victim, Character villain, Long damage, Long health) {

        if (victim == villain) {
            return setHealth(health);
        }else if (damage > 1000L && villain != victim){
             setHealth(0L);
             setAlive(false);
            return damage;
        }
        this.health -= damage;
        return damage;
    }

    public void health(Character victim, Character doctor, Long health, Boolean isAlive) {
        victim.cure(victim, doctor, health, isAlive);
    }

    private Long cure(Character victim, Character doctor, Long health, Boolean isAlive) {

        if (victim != doctor){
            return setHealth(health);
        }
        else if (health <= 950L && isAlive == true && victim == doctor) {
            return setHealth(health + 50L);
        }

        return setHealth(health);
    }
}
