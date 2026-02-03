package array;

public class MultiDArrayDemo1 {
    public static void main(String[] args) {
        // single D array using new keyword

        int arr[][] = new int[2][3];
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[1][0] = 40;
        arr[1][1] = 50;
        arr[1][2] = 60;

        System.out.println("Row size: " + arr.length);
        System.out.println("Column size: " + arr[0].length);

        System.out.println("************ for loop*************");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            }
        }
    }
}
