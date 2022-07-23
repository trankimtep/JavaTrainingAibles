import java.util.Scanner;

public class BinaryGeneration {

    public static int START_POSITION = 0;

    static void printTheArray(int array[], int arrayLength) {
        for (int i = 0; i < arrayLength; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    static void generateAllBinaryStrings(int length, int array[], int position) {
        if (position == length) {
            printTheArray(array, length);
            return;
        }
        
        array[position] = 0;
        generateAllBinaryStrings(length, array, position + 1);
    
        array[position] = 1;
        generateAllBinaryStrings(length, array, position + 1);
    }

       public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the binary string's length:");
            int binaryStringLength = scanner.nextInt();

            int[] array = new int[binaryStringLength];
            generateAllBinaryStrings(binaryStringLength, array, START_POSITION);
       }
}
