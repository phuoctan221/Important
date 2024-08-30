package method;

import java.util.Scanner;

public class Method {

    public static float[] importData(float[] arrays) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("a[" + i + "]= ");
            arrays[i] = keyboard.nextFloat();
        }
        return arrays;
    }

    public static void printData(float[] arrays) {
        System.out.println("OUT: ");
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("a[" + i + "]= " + arrays[i]);
        }
    }

    public static float findMax2(float[] arrays) {
        float max1 = arrays[0];
        float max2 = arrays[0];

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > max1) {
                max1 = arrays[i];
            }
        }

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] < max1) {
                max2 = arrays[i];
                break;
            }
        }

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > max2 && arrays[i] < max1) {
                max2 = arrays[i];
            }
        }
        return max2;
    }

    public static float[] deleteOddNumber(float[] arrays) {
        int countEven = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 == 0) {
                countEven++;
            }
        }

        float[] newArray = new float[countEven];
        int index = 0;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] % 2 == 0) {
                newArray[index] = arrays[i];
                index++;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu trong mang: ");
        int numbers = keyboard.nextInt();
        float[] arrays = new float[numbers];
        importData(arrays);
        System.out.println("-----------------------------");
        printData(arrays);
        System.out.println("-----------------------------");
        System.out.println("So lon thu hai trong mang: " + findMax2(arrays));
        System.out.println("-----------------------------");
        System.out.println("Mang sau khi xoa cac phan tu le khoi mang");
        printData(deleteOddNumber(arrays));
    }

}
