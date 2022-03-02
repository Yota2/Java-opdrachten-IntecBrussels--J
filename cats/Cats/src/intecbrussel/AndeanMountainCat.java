package intecbrussel;

public class AndeanMountainCat extends Felis{
    public AndeanMountainCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }

    public AndeanMountainCat() {

    }

    public String miauw(String customSound){
        return customSound;
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}


