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
    //public static char[] sort(char[] newchar) {
       /* char[] token = newchar.toCharArray();
        for(int i = 0; i<token.length; i++){
            for(int j = i+1; j<token.length; j++){
                if(token[i] > token[j]){
                    char temp = token[i];
                    token[i] = token[j];
                    token[j] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(token));
    }

        */
    //   return newchar;

}