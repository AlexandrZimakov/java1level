package ru.gb.zimakov;

public class HomeWork5 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov","Slesar", "iv@mail.ru","89112345678",12.500,32);
        employees[1] = new Employee("Ivanov1","Slesar1", "iv1@mail.ru","89112345378",12.500,41);
        employees[2] = new Employee("Ivanov2","Slesar2", "iv2@mail.ru","89112345778",12.500,32);
        employees[3] = new Employee("Ivanov3","Slesar3", "iv3@mail.ru","89112345378",12.500,49);
        employees[4] = new Employee("Ivanov4","Slesar4", "iv4@mail.ru","89112345478",12.500,32);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].printInfo();
            }
        }
    }
}
