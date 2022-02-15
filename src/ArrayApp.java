import java.util.Arrays;
import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) {
        Scanner KBD = new Scanner(System.in);
        System.out.println("\nHow much times do you give a numbers to restrict array input : ");
        int sizeArray = KBD.nextInt();
        int[] arrayNumbers = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            System.out.println("Enter the integer number  :  ");
            arrayNumbers[i] = KBD.nextInt();
        }

        System.out.println("Given numbers are  : \t" + Arrays.toString(arrayNumbers) );
        System.out.println("Sorted true  or false?    :" + IntArrayTools.isSorted(arrayNumbers) );
        System.out.println("\nArrays  are sorted in ascending order:  :" + Arrays.toString(IntArrayTools.sort(arrayNumbers)));
        System.out.println("Give the number to be chased or searched : ");
        int key= KBD.nextInt();
        System.out.println("\nIs the number exist? True or false :  :" + Arrays.toString(new boolean[]{IntArrayTools.chopsearch(arrayNumbers, key)}));

        System.out.println("fill Characters to get only alphabets filter");
        KBD.nextLine();  //TODO: this is to avoid a bug -> skipping the opportunity to input a String
        String str = KBD.nextLine();
        char[] charArray = str.toCharArray();
        System.out.println(charArray);
        System.out.println("Alphabet are found   : " + Arrays.toString(CharArrayTools.filterAlphabet(charArray)));
        System.out.println("Alphabet are sorted   : " + Arrays.toString(CharArrayTools.sort(charArray)));
        KBD.close();
    }


}