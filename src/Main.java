import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printArray(reverse(getArray(5)));
    }
    public static int[] getArray(int count){
        System.out.println("enter the elements\n");
        int[] array = new int[count];
        for (int i=0 ; i<count ; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int[] reverse(int [] array){
        int temp;
        for (int i=0 ; i<array.length/2 ; i++){
            temp = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;

        }
        return array;
    }
    public static void printArray(int [] array){
        int[]print = new int[array.length];
        for (int i =0 ;i<array.length ; i++){
            print[i]=array[i];
            System.out.println(print[i]);
        }
    }
}
