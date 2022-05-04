package ru.gb.zimakov1;

public abstract class Animal {

    private static int count;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    public Animal(int maxRunDistance, int maxSwimDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        count++;
    }

    public abstract boolean run(int distance);
    public abstract boolean swim(int distance);

    public static int getCount() {
        return count;
    }
}
