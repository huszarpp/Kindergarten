package com.codecool.kindergarten.child;

public abstract class Child {

    private int satisfaction = 2;
    private boolean isWhining = false;

    public abstract void changeSatisfaction(Activities activity);

    public void changeWhining() {
        isWhining = (satisfaction == 0);
    }

    public int getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(int satisfaction) {
        this.satisfaction = satisfaction;
    }

    public boolean isWhining() {
        return isWhining;
    }

    public void setWhining(boolean whining) {
        isWhining = whining;
    }
}
