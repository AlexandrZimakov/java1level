package ru.gb.zimakov1;

public class Cat extends Animal {

    public Cat(int maxRunDistance, int maxSwimDistance) {
        super(maxRunDistance, maxSwimDistance);
    }

    @Override
    public boolean run(int distance) {
        if (distance < this.maxRunDistance) {
            System.out.printf("Кот пробежал %d метров", distance);
            return true;
        }
        System.out.println("Кот не смог пробежать");
        return false;
    }

    @Override
    public boolean swim(int distance) {
        System.out.println("Кот не умеет плавать");
        return false;
    }
}
