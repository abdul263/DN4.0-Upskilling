class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
public class InheritanceExaample {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        a.makeSound(); // Animal sound
        d.makeSound(); // Bark
    }
}
