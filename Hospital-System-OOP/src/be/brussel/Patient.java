package be.brussel;
import java.util.*;
import java.util.Set;
import java.util.LinkedHashSet;


public class Patient implements Comparable<Patient> {
    private String nationalRegistryNumber;
    private String fullName;
    private int age;
    private int temperature;
    private boolean unKnownVirus;
    private boolean ensure;

public Patient(){

}
    public Patient(String nationalRegistryNumber, String fullName, int age, int temperature, boolean unKnownVirus, boolean ensure) {
        this.nationalRegistryNumber = nationalRegistryNumber;
        this.fullName = fullName;
        this.age = age;
        this.temperature = temperature;
        this.unKnownVirus = unKnownVirus;
        this.ensure = ensure;

    }

    public String getNationalRegistryNumber() {
        return nationalRegistryNumber;
    }

    public void setNationalRegistryNumber(String nationalRegistryNumber) {
        this.nationalRegistryNumber = nationalRegistryNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTemperature() {

        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isUnKnownVirus() {
        return unKnownVirus;
    }

    public void setUnKnownVirus(boolean unKnownVirus) {
        this.unKnownVirus = unKnownVirus;
    }

    public boolean isEnsure() {
        return ensure;
    }

    public void setEnsure(boolean ensure) {
        this.ensure = ensure;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "nationalRegistryNumber='" + nationalRegistryNumber + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", temperature=" + temperature +
                ", unKnownVirus=" + unKnownVirus +
                ", ensure=" + ensure +
                '}';
    }




    @Override
    public int compareTo(Patient o) {
        return 0;
    }

    public static Patient proirity(Patient o5, Patient o6) {
        if (o5.getAge() == o6.getAge() ) {
            return getHigerTemp(o5, o6);
        } else {
            if(o5.getTemperature() != o6.getTemperature()){
                return getHigerTemp(o5, o6);
            }
             return o5.getAge() > o6.getAge() ? o5: o6;
        }
    }

    private static Patient getHigerTemp(Patient o5, Patient o6) {
        if (o5.getTemperature() > o6.getTemperature()) {
            return o5;
        } else {
            return o6;
        }
    }
}
