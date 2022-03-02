package intecbrussel;

public class TurkishVanCat extends  Felis{
    public String nikName;

    public TurkishVanCat(String name, int age, int shelterNo, int badgeNo ,String nikName) {
        super(name, age, shelterNo, badgeNo);
        this.nikName = nikName;
    }
}
