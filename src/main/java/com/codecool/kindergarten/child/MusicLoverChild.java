package com.codecool.kindergarten.child;

public class MusicLoverChild extends Child {

    @Override
    public void changeSatisfaction(Activities activity) {
        switch (activity) {
            case SINGING:
                setSatisfaction(4);
                break;
            case PLAYING_BALL:
                setSatisfaction(getSatisfaction() - 1);
                break;
            case DRAWING:
                setSatisfaction(getSatisfaction() - 1);
                break;
            case DANCING:
                break;
        }
    }
}