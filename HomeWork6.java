/*
*
* Java 1. Homework #6
* @author Marina Yurkova
* @version 28.12.21
*/
class HomeWork6 {
    public static void main(String[] args) {
        IAnimal cat = new Cat ("Barsik", "white", 3, 100, 0);
        IAnimal dog = new Dog ("Juchka", "grey", 10, 400, 7);
        IAnimal[] animals = {cat, dog};
        for (IAnimal a : animals) {
            System.out.println(a);
            System.out.println(a.run(300));
            System.out.println(a.swim(5));
        }
    }
}

interface IAnimal {
    String run(int distance);
    String swim(int distance);
}

class Cat extends Animal {
    Cat (String name, String color, int age, int stopRun, int stopSwim) {
        super(name, color, age, stopRun, stopSwim);
    }

    @Override
    public String run(int distance) {
        return distance > 200? name + " cant run " + distance + "m" : name + " run " + distance + "m";
    }

    @Override
    public String swim(int distance) {
        return distance > 0? name + " cant swim": name + " cant swim";
    }
}

class Dog extends Animal {
    Dog (String name, String color, int age, int stopRun, int stopSwim) {
        super(name, color, age, stopRun, stopSwim);
    }

    @Override
    public String run(int distance) {
        return distance > 500? name + " cant run " + distance + "m" : name + " run " + distance + "m";
    }

    @Override
    public String swim(int distance) {
        return distance > 10? name + " cant swim " + distance + "m" : name + " swim " + distance + "m";
    }
}

abstract class Animal implements IAnimal {
    protected String name;
    protected String color;
    protected int age;
    protected int stopRun;
    protected int stopSwim;

    Animal (String name, String color, int age, int stopRun, int stopSwim) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.stopRun = stopRun;
        this.stopSwim = stopSwim;
    }

    @Override
    public String toString() {
        return name + ", " + color + ", " + age + ", " + stopRun + "m, " + stopSwim + "m";
    }
}