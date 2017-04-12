package com.company;

/**
 * @author e.yushin
 */
public class deathCounter implements healthObserver {
    int health;
    int count = 0;
    bunch bunch;

    public deathCounter(bunch bunch){
        this.bunch = bunch;
        this.health = bunch.health;
        bunch.registerObserver(this);
    }

    @Override
    public void update(int health){
        count++;
        if (!bunch.isAlive()) {
            System.out.println(bunch.name + " is dead ");
        } else {
            System.out.println(bunch.name + " stayed alive for " + count + " turns with current " + health + " health");
        }
    }
}
