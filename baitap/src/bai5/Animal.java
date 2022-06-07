package bai5;

public class Animal {
    private double weight;
    private int height;
    private String gender;
    private String color;

    public Animal(){}

    public Animal(double weight, int height, String gender, String color) {
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", height=" + height +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
