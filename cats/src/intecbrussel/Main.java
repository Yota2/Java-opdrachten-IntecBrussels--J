package intecbrussel;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Felis> cats = new ArrayList<>();
        NorwegianForestCat cat1 = new NorwegianForestCat("new", 44,21, 45);
        AndeanMountainCat cat2 = new AndeanMountainCat();
        NorwegianForestCat cat3 = new NorwegianForestCat("new 22232", 44,23, 40);
        NorwegianForestCat cat4 = new NorwegianForestCat("new", 44,23, 40);
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        for(Felis f: cats) {
            if(f.isAlive()) {
                f.addVaccination();
            }
        }
        System.out.println(Felis.getNoOfVaccinatedCats());
        System.out.println(cat3.equals(cat4)); // should return true
        System.out.println(cat3.equals(cat1)); // should return false

    }
}

