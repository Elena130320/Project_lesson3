import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {

    }
    public static void inVersionArray() {
        int[] myArray1 = new int[10];
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i=0; i < myArray1.length; i++) {
            if (myArray1[i]==1) {
                myArray1[i]=0;
            } else {
                myArray1[i]=1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i=0; i < arr.length; i++) {
            arr[i]=(i+1);
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void increaseTwoArray() {
        int[] myArray3 = new int[12];
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i=0; i < myArray3.length; i++) {
            if (myArray3[i] < 6) {
                myArray3[i] *= 2;
               System.out.print(myArray3);
            }
        }
    }
    public static void diagonalArray() {
        int[] [] myArray4 = new int[3][3];
        for (int i=0; i < 3; i++) {
            for (int j=0; j < 3; j++) {
                myArray4[i] [j] = 1;

            }
        }


    }
    public static int[] newOneArray(int len, int initialValue) {
        int[] myArray5 = new int[len];
        for (int i=1; i<myArray5.length; i++) {
           myArray5[i] = initialValue;
        }
        return myArray5;

    }
}
