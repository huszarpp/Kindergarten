package com.codecool.kindergarten.child;

public abstract class Child {

    private int satisfaction = 2;
    private boolean isWhining = false;

    abstract void changeSatisfaction(Activities activity);

    private void changeWhining() {
        setWhining(satisfaction == 0);
    }

    public final void playFor30Minutes(Activities activity) {
        changeSatisfaction(activity);
        changeWhining();
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
