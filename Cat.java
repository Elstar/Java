public class Cat {
    private String colour;
    private double age;
    private double weight;
    private String breed;

    public Cat(String colour, double age, double weight, String breed) {
        this.colour = colour;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public Cat() {
    }

    public String getColour() {
        return colour;
    }

    public double getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "colour='" + colour + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                '}';
    }
}
