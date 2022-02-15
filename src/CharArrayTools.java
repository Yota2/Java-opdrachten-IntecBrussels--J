import java.util.Scanner;

public class CharArrayTools {

    public static char[] filterAlphabet(char[] array) {
        int totalCount = 0;
        for (char c : array) {
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                // TODO: Search how many valid chars there are
                totalCount++;
            }
        }
        char[] newchar = new char[totalCount];
        for (int i = 0, j = 0; i < array.length; i++) {
            if ((array[i] >= 'A' && array[i] <= 'Z') || (array[i] >= 'a' && array[i] <= 'z')) {
                //TODO: add valid char to new array
                newchar[j++] = array[i];
            }
        }
        return newchar;
    }
    public static char[] sort(char[] newchar) {
        newchar = filterAlphabet(newchar);
        for(int i = 0; i<newchar.length; i++){
            for(int j =0; j<(newchar.length-1)-i; j++){
                if(newchar[j] > newchar[j+1]){
                    char temp = newchar[j];
                    newchar[j] = newchar[j+1];
                    newchar[j] = temp;
                }
            }
        }
       return newchar;
    }



}