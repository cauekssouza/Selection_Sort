public class Main_Selection {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 4, 7, 2, 10};
        System.out.println("Array original:");
        Selection.printArray(array);

        Selection.selection(array);

        System.out.println("\nArray ordenado:");
        Selection.printArray(array);
    }

}
