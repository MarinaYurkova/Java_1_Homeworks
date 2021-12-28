/*
*
* Java 1. Homework #5
* @author Marina Yurkova
* @version 23.12.21, corrected 28.12.21
*/

class HomeWork5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Vasiliy Ivanovich Metelkin", "dvornik", "email1@email", 89231111111L, 20000, 50);
        persArray[1] = new Person("Pavel Sergeevich Muha", "courier", "email2@email", 89231111112L, 25000, 20);
        persArray[2] = new Person("Marya Petrovna Bulochka", "povar", "email3@email", 89231111113L, 30000, 65);
        persArray[3] = new Person("Viktorya Viktorovna Viktorchuk", "prodavetz", "email4@email", 89231111114L, 35000, 25);
        persArray[4] = new Person("Alexey Anatolevich Navalny", "buhgalter", "email5@email", 89231111115L, 35000, 45);
        for (int i = 0; i < persArray.length; ++i) {
            if (persArray[i].getAge() >= 40) {
                System.out.println(persArray[i]);
            }
        }
    }
}

class Person {
    private String name;
    private String position;
    private String email;
    private long tel;
    private int salary;
    private int age;

    Person(String name, String position, String email, long tel, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + ", " + position + ", " + email + ", " + tel + ", " + salary + ", " + age;
    }
}