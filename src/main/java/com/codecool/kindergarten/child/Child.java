package com.codecool.kindergarten.child;

public abstract class Child {

    private String name;
    private int satisfaction = 2;
    private boolean isWhining = false;

    public Child(String name) {
        this.name = name;
    }

    abstract void changeSatisfaction(Activities activity);

    private void changeWhining() {
        setWhining(satisfaction == 0);
    }

    public final void playFor30Minutes(Activities activity) {
        changeSatisfaction(activity);
        changeWhining();
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Personality: " + this.getClass().getSimpleName() + " Satisfaction: " + this.satisfaction + " Whining: " + isWhining;
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
