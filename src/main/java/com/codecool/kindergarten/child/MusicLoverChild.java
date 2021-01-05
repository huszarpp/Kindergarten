package com.codecool.kindergarten.child;

public class MusicLoverChild extends Child {

    public MusicLoverChild(String name) {
        super(name);
    }

    @Override
    void changeSatisfaction(Activities activity) {
        switch (activity) {
            case SINGING:
                setSatisfaction(4);
                break;
            case PLAYING_BALL:
                if (getSatisfaction() > 0) {
                    setSatisfaction(getSatisfaction() - 1);
                }
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