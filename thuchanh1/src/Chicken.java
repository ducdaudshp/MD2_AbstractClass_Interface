public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: Cluck-cluck!!!";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
