package com.company;

import java.util.LinkedList;
import java.util.List;

/**
 * @author e.yushin
 */
public class bunch implements healthObserverable {
    String name = "i'm bunch";
    int health = 1;

    private List<healthObserver> listHealthObservers;

    public bunch(){
        listHealthObservers = new LinkedList<healthObserver>();
    }

    @Override
    public void registerObserver(healthObserver o){
        listHealthObservers.add(o);
    }

    @Override
    public void removeObserver(healthObserver o){
        listHealthObservers.remove(o);
    }

    @Override
    public void notifyObservers(){
        for(healthObserver observer: listHealthObservers)
            observer.update(health);
    }

    public boolean isAlive(){
        return this.health>0;
    }

    public void setHealth(int health){
        this.health = health;
        notifyObservers();
    }
}
