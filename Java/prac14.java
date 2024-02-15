class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    private boolean isTrained;

    public Dog(String name, boolean isTrained) {
        super(name);
        this.isTrained = isTrained;
    }

    public void bark() {
        System.out.println(name + " barks!");
    }

    @Override
    public void makeSound() {
        bark();
    }

    public void performTrick() {
        if (isTrained) {
            System.out.println(name + " performs a trick!");
        } else {
            System.out.println(name + " needs more training...");
        }
    }
}

public class prac14 {

    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        Dog dog = new Dog("Fido", true);

        animal.makeSound();
        dog.makeSound();
        dog.bark();
        dog.performTrick();
    }
}
