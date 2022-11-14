public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Wuf");

    }

    @Override
    public Boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean moodType) {
        if (moodType) {
            System.out.println("logrer");
        } else{
            System.out.println("knurrer");
        }
    }

}
