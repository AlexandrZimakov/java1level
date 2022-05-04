package ru.gb.zimakov1;

public class HomeWork6 {
    public static void main(String[] args) {
        Animal[] participants = prepareParticipants();
        for (Animal participant : participants) {
            participant.run(300);
            participant.swim(20);
        }

        System.out.println("Количество созданных животных"+ " " + Animal.getCount());
    }

    private static Animal[] prepareParticipants() {
        return new Animal[] {
                new Dog(500,10),
                new Cat(200,1)
        };
    }

}
