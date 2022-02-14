public class IntArrayTools {
    //Maak een methode aan met de naam isSorted. Deze methode neemt een array van
//ints als argument en geeft een boolean waarde terug. (returntype is boolean).
    static boolean isSorted(int[] array){
        boolean increasing = true, decreasing = true;
        if (array.length <= 2) {
            return true;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i-1]) {
                increasing = false;
            }
            if (array[i] > array[i-1]) {
                decreasing = false;
            }
            if (!increasing && !decreasing) {
                return false;
            }
        }

        return true;
    }
    //sort
    //De methode gaat de array sorteren op grootte.
    public static int[] sort(int[] arrayNumbers) {
        int now = 0;
        //Sort the array in ascending order
        for (int i = 0; i < arrayNumbers.length; i++) {
            for (int j = i + 1; j < arrayNumbers.length; j++) {
                if (arrayNumbers[i] > arrayNumbers[j]) {
                    now = arrayNumbers[i];
                    arrayNumbers[i] = arrayNumbers[j];
                    arrayNumbers[j] = now ;
                }
            }
        }

        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.print(arrayNumbers[i] + " ");
        }
        return arrayNumbers;
    }
    //Maak een methode aan met de naam chopSearch. Deze methode neemt een int
    //array numbers en een int key als argument en geeft een boolean waarde terug.
    public static boolean chopsearch(final int[] array, final int key) {
        boolean result = false;
        for(int i : array){
            if(i == key){
                result = true;
                break;
            }
        }
        return result;
    }}