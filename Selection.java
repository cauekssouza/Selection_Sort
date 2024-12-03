// Classe Selection sort
public class Selection {
    public static void selection(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i; 
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) { 
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        
            System.out.print("Iteração " + (i + 1) + ": ");
            printArray(array);
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " "); 
        }
        System.out.println(); 
    }
}
