package com.codecool.kindergarten.child;

public class LivelyChild extends Child {

    public LivelyChild(String name) {
        super(name);
    }

    @Override
    void changeSatisfaction(Activities activity) {
        switch (activity) {
            case SINGING:
                if (getSatisfaction() > 0) {
                    setSatisfaction(getSatisfaction() - 1);
                }
                break;
            case PLAYING_BALL:
                setSatisfaction(3);
                break;
            case DRAWING:
                if (getSatisfaction() > 0) {
                    setSatisfaction(getSatisfaction() - 1);
                }
                break;
            case DANCING:
                break;
        }
    }
}
