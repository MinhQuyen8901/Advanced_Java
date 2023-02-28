package Day4b.Ex6_6;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        super.greets();
        System.out.println("Woof!");
    }

    @Override
    public void greets(Dog another) {
        super.greets(another);
        System.out.println("Wooooooof!");
    }
}
