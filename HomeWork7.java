/*
*
* Java 1. Homework7 #
* @author Marina Yurkova
* @version 01.01.22
*/
class HomeWork7 {
    public static void main(String[] args) {
        Cat[] cats = {
            new Cat ("Kasper", 5), new Cat ("Arkasha", 10), new Cat ("Borys", 15)
        } ;
        Plate plate = new Plate (35, 45);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate);
        plate.add(25);
        System.out.println(plate);
        
        for (Cat cat : cats) {
            cat.setSatiety (false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
        }
    }

class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    void setSatiety (boolean status) {
        satiety = status;
    }

    void eat(Plate plate) {
        if (!satiety) {
            satiety = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return name + ", appetite: " + appetite + ", satiety: " + satiety;
    }
}

class Plate {
    private int food;
    private int volume;

    Plate (int food, int volume) {
        this.food = food;
        this.volume = volume;
    }

    boolean decreaseFood (int oneserve) {
        if (food < oneserve) {
            return false;
        }
        food -= oneserve;
        return true;
    }

    void add (int food) {
        if (this.food + food <= volume) {
            this.food += food;
        }
    }

    @Override
    public String toString() {
        return "Plate: " + food;
    }
}