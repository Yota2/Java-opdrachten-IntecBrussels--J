package be.brussel;

import java.util.Comparator;

public class PriorityComperator implements Comparator<Patient> {
    @Override
    public int compare(Patient o1, Patient o2) {
        if (o1.equals(o1.getAge())) {
            return o1.getTemperature() - o2.getTemperature();
        } else {
            if(o1.getTemperature() != o2.getTemperature()){
                return o1.getTemperature() - o2.getTemperature();
            }
            return  o1.getAge() - o2.getAge();
        }
    }
}
