package com.codecool.kindergarten.child;

public class LivelyChild extends Child {

    @Override
    public void changeSatisfaction(Activities activity) {
        switch (activity) {
            case SINGING:
                setSatisfaction(getSatisfaction() - 1);
                break;
            case PLAYING_BALL:
                setSatisfaction(3);
                break;
            case DRAWING:
                setSatisfaction(getSatisfaction() - 1);
                break;
            case DANCING:
                break;
        }
    }
}
