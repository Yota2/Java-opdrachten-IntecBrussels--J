package intecbrussel;

public  class  Panthera extends Animal {
    public String roar(String roar) {
        return roar(roar);
    }

    public void hunt(){
        System.out.println("Is hunting");
    }


    public  Panthera( ){

    }
    public String roar() {
        return "Panthera is roaring...";
    }
    public Panthera(char size, char coat, String color, Double weight, String roar ){
        super(size,coat,color,weight);
        this.roar(roar);
    }

    @Override
    public String toString() {
        return "Panthera{" +
                "Roar=" + roar(new String("roar")) +
                '}';
    }


}
