package ru.gb.zimakov1;

public class Dog extends Animal {

    public Dog(int maxRunDistance, int maxSwimDistance) {
        super(maxRunDistance, maxSwimDistance);
    }

    @Override
    public boolean run(int distance) {
        if (distance < this.maxRunDistance) {
            System.out.printf("Собака пробежала %d метров%n", distance);
            return true;
        }
        System.out.println("Собакак не смогла пробежать");
        return false;
    }

    @Override
    public boolean swim(int distance) {
        if (distance < this.maxSwimDistance) {
            System.out.printf("Собака проплыла %d метров%n", distance);
            return true;
        }
        System.out.println("Собака не смогла проплыть");
        return false;
    }
}
