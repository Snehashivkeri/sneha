package switchdemo;

public class CheckingTheRangeOfData {
    public static void main(String[] args) {
        //WAP to validate the range of data/number ?

        int num =16;
        switch(num) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Five");
                break;

            case 6: case 7: case 8: case 9: case 10:
                System.out.println("Ten");
                break;

            case 11: case 12: case 13: case 14: case 15:
                System.out.println("Fifteen");
                break;
            default:
                System.out.println("Invalid number:" + num);
        }
    }
}
