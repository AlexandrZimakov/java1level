package ru.gb.zimakov;


public class Employee {
    private final String fio;
    private final String position;
    private final String email;
    private final String telephone;
    private final double salary;
    private final int age;

    public Employee(String fio, String position, String email, String telephone, double salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void printInfo(){
        System.out.println("ФИО: "+fio);
        System.out.println("Должность: "+position);
        System.out.println("Почта: "+email);
        System.out.println("Телефон: "+telephone);
        System.out.println("Зарплата : "+salary);
        System.out.println("Возраст : "+age);
    }
}