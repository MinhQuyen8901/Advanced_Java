package Day4b.Ex6_6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woooof!");
    }

    public void greets(Dog another){
        System.out.println("Woooooooooof!");
    }
}
