package intecbrussel;
public abstract class Animal {
    protected static int animalCount;
    private char size;
    private char coat;
    private  String color;
    private Double weight;



    public  Animal(char size,char coat,String color, double weight){
        this.coat=coat;
        this.color=color;
        this.size=size;
        this.weight=weight;
    }

    public Animal() {

    }

    public void makeNoise(String makeNoise) {
        System.out.println("Is making noise.. ");
    };

    public void eat(){
        System.out.println("Is eating.. ");
    };

    public  void sleep() {
        System.out.println("Is sleeping.. ");
    };

    public boolean isAlive(){
        return true;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public static void addAnimalCount(int animalCount) {
        Animal.animalCount++;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public char getCoat() {
        return coat;
    }

    public void setCoat(char coat) {
        this.coat = coat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal";
    }
}

