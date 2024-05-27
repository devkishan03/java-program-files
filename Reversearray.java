package Assignment;

public class Reversearray {

    public static void printReverseArray(int arr[]) {

        int temp;
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        System.out.println("Reverse array will be:");
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int Myarr[] = new int[15];
        System.out.println("Initial array values:");
        for (int i = 0; i < Myarr.length; i++) {
            System.out.println(Myarr[i] = i * 2);
        }
        printReverseArray(Myarr);
    }
}
