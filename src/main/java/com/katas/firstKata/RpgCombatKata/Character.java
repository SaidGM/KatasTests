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

    public void attacks(Character victim, Long damage) {
        victim.damage(damage);
    }

    private void damage(Long damage) {
        if (damage > 1000L){
             setHealth(0L);
             setAlive(false);
             return;
        }
        this.health -= damage;
    }

    public void health(Character victim, Long health, Boolean isAlive) {
        victim.cure(health, isAlive);
    }

    private Long cure(Long health, Boolean isAlive) {
        if (health <= 950L && isAlive == true){
            return setHealth(health + 50L);
        }
        return setHealth(health);
    }
}
