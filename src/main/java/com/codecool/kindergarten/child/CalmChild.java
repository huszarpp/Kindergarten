package com.codecool.kindergarten.child;

public class CalmChild extends Child {

    @Override
    public void changeSatisfaction(Activities activity) {
        switch (activity) {
            case SINGING:
                break;
            case PLAYING_BALL:
                setSatisfaction(getSatisfaction() - 2);
                break;
            case DRAWING:
                setSatisfaction(4);
                break;
            case DANCING:
                setSatisfaction(getSatisfaction() - 1);
                break;
        }
    }
}