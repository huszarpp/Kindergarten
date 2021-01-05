package com.codecool.kindergarten;

import com.codecool.kindergarten.child.Activities;
import com.codecool.kindergarten.child.Child;

import java.util.ArrayList;
import java.util.List;

public class Kindergarten {

    private final List<Child> children = new ArrayList<>();
    private boolean isChaos = false;
    private boolean wasChaos = false;

    public void addChild(Child newChild) {
        children.add(newChild);
    }

    public void simulate30Minutes(Activities activity) {
        int whineCounter = 0;
        for (Child child : children) {
            child.playFor30Minutes(activity);
            if (child.isWhining()) {
                whineCounter++;
            }
        }
        isChaos = (whineCounter >= 3);
        if (!wasChaos) {
            wasChaos = isChaos;
        }
    }

    public boolean wasChaos() {
        return wasChaos;
    }
}
