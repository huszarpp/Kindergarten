package com.codecool.kindergarten;

import com.codecool.kindergarten.child.*;

public class SimulateKindergarten {

    public static void main(String[] args) {

        Kindergarten yellowKindergarten = new Kindergarten();

        Activities[] todayActivities = {
                Activities.DANCING,
                Activities.DRAWING,
                Activities.SINGING,
                Activities.PLAYING_BALL,
                Activities.DANCING,
                Activities.DRAWING,
                Activities.SINGING,
                Activities.PLAYING_BALL,
                Activities.DANCING,
                Activities.DRAWING,
                Activities.SINGING,
                Activities.PLAYING_BALL
        };

        Child child1 = new LivelyChild("John");
        Child child2 = new MusicLoverChild("Jenny");
        Child child3 = new CalmChild("Diana");
        Child child4 = new LivelyChild("George");
        Child child5 = new LivelyChild("Hanna");

        yellowKindergarten.addChild(child1);
        yellowKindergarten.addChild(child2);
        yellowKindergarten.addChild(child3);
        yellowKindergarten.addChild(child4);
        yellowKindergarten.addChild(child5);

        for (Activities activity : todayActivities) {
            System.out.println("Next activity: " + activity);
            yellowKindergarten.simulate30Minutes(activity);
            System.out.println("Chaos: " + yellowKindergarten.isChaos());
            System.out.println("Was chaos: " + yellowKindergarten.wasChaos());
        }


    }
}
