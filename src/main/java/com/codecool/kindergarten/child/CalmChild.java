package com.codecool.kindergarten.child;

public class CalmChild extends Child {

    public CalmChild(String name) {
        super(name);
    }

    @Override
    void changeSatisfaction(Activities activity) {
        switch (activity) {
            case SINGING:
                break;
            case PLAYING_BALL:
                if (getSatisfaction() > 2) {
                    setSatisfaction(getSatisfaction() - 2);
                } else {
                    setSatisfaction(0);
                }
                break;
            case DRAWING:
                setSatisfaction(4);
                break;
            case DANCING:
                if (getSatisfaction() > 0) {
                    setSatisfaction(getSatisfaction() - 1);
                }
                break;
        }
    }
}