package intecbrussel;

public class Acinonyx extends Animal {

    private double speed;

    public  double run(double distance){
        return distance;
    }

    public void kiawuww(){
    }

    public Acinonyx(){
        super();
    }
    public  Acinonyx (char size, char coat, String color, Double weight, double speed ){
        super(size,coat,color,weight);
        this.speed=speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "This is the Cheetah with speed of " + this.speed;
    }
}


