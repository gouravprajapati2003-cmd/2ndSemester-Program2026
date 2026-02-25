abstract class Animal {
    abstract void makeSound();
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog says: Woof Woof");
    }
}
class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat says: Meow Meow");
    }
}
public class Abstruct {
    public static void main(String[] args) {

        Animal a1 = new Dog();   
        Animal a2 = new Cat();

        a1.makeSound();
        a1.eat();

        a2.makeSound();
        a2.eat();
    }
}