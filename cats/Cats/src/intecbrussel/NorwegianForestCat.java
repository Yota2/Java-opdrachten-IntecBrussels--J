package intecbrussel;

public class NorwegianForestCat extends Felis {
    public void miauwInNorvegian(){
        System.out.println("Miauw In Norvegian..");
    }

    public NorwegianForestCat(){
        super();

    }
    public  NorwegianForestCat( String name, int age, int shelterNo, int badgeNo){
        super(name ,age,shelterNo,badgeNo);
    }


    @Override
    public String toString() {
        return "NorwegianForestCat{}";
    }

}


