public abstract class Animal {
    private String name;
    private String foodType;
    private String moodType;


    public abstract void makeSound();

    public abstract Boolean eat (String foodType);

    public abstract void showMood (boolean moodType);



}
