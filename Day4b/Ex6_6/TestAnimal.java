package Day4b.Ex6_6;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bông");
        System.out.println("Cat 1 greet:");
        cat1.greets();
        Dog dog1 = new Dog("Xu");
        System.out.println("Dog 1 greet:");
        dog1.greets();
        BigDog bigDog1 = new BigDog("Gấu");
        System.out.println("BigDog 1 greet:");
        bigDog1.greets();

        // Using Polymorphism
        Animal animal1 = new Cat("A");
        System.out.println("Cat 2 greet:");
        animal1.greets();
        Animal animal2 = new Dog("B");
        System.out.println("Dog 2 greet:");
        animal2.greets();
        Animal animal3 = new BigDog("C");
        System.out.println("BigDog 2 greet:");
        animal3.greets();
//        Animal animal4 = new Animal();

        // Downcast
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
        Cat cat2 = (Cat)animal2;
        dog2.greets(dog3);
        dog3.greets(dog2);
        dog2.greets(bigDog2);
        bigDog2.greets(dog2);
        bigDog2.greets(bigDog1);

    }
}
