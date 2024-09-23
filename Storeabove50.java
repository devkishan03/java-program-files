public class Storeabove50 {

    public static int[] storeabovefifty(int arr[]) {
        int newarr[] = new int[50];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 50) {
                newarr[arr[i] - 51]++;
            }
        }
        return newarr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 51, 50, 51, 52, 52, 60, 60, 70, 80, 90, 90, 87, 78, 65, 56, 65, 55 };
        int arr2[] = storeabovefifty(arr);
        for (int i : arr2) {
            System.out.print(i);
        }
    }
}