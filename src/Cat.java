public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Miav");
    }

    @Override
    public Boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean moodType) {
        if (moodType) {
            System.out.println("spinder");
        } else{
            System.out.println("hvæser");
        }
    }
}
