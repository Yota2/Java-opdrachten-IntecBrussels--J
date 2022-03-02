package intecbrussel;
public class Felis  extends Animal{
    private static  int vacationcount;
    private String name;
    private  int age;
    private  int shelterNo;
    private int badgeNo;

    public Felis(String name, int age, int shelterNo, int badgeNo) {
        this.name = name;
        this.age = age;
        this.shelterNo = shelterNo;
        this.badgeNo = badgeNo;
    }

    public Felis() {

    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Felis) {
            Felis cat = (Felis) o;
            if(cat.shelterNo == this.shelterNo && cat.badgeNo == this.badgeNo) {
                return true;
            }
        }
        return false;
    }

    public static int getNoOfVaccinatedCats() {
        return vacationcount;
    }

    public static void addVaccination() {
        Felis.vacationcount++;
    }}
