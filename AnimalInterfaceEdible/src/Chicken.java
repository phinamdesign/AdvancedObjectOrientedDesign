public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Gà kêu : Ò ó o o ....";
    }

    @Override
    public String howToEat() {
        return "Gà ăn thóc";
    }
}
