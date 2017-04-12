package com.company;

public class Main {

    public static void main(String[] args) {
	    Mob mob1 = new Mob("mob1", 110, 21);
	    deathCounter counter1 = new deathCounter(mob1);
        Mob mob2 = new Mob("mob2", 210, 30);
        deathCounter counter2 = new deathCounter(mob2);

        for (int rounds = 0; rounds < 10; rounds++) {
            mob1.dealDamage(mob2);
            mob2.dealDamage(mob1);
        }
    }
}
