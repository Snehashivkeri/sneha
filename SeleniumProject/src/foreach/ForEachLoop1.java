package foreach;

public class ForEachLoop1 {
    public static void main(String[] args) {
        //WAP to display the values from the Multi D array ?

        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int x1[] : arr) {
            for(int x:x1) {
                System.out.print(x+ "");
            }
            System.out.println();
        }
    }
}
