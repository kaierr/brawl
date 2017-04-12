package com.company;

/**
 * @author e.yushin
 */
public class Mob extends bunch {
    int damage;

    public Mob(){
        this.name = "Default mob";
        this.health = 100;
        this.damage = 20;
    }

    public Mob(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public boolean dealDamage(Mob target){
        if (!this.canCast())
            return false;
        if (!target.isAlive()) {
            System.out.println(this.name + " punches corpse of " + target.name);
            return false;
        }
        System.out.println(this.name + " hits " + target.name + " for " + this.damage + " damage");
        target.setHealth(Math.max(target.health - this.damage, 0));
        return true;
    }
    
    public boolean canCast(){
        return this.isAlive();
    }
}
