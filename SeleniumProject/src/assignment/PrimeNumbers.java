package assignment;

public class PrimeNumbers {
    public static void main(String[] args) {
        //WAP to find the prime numbers ?

        int num = 117;
        int count =0;//flag concept
        for(int i=2; i<num; i++) {
            if((num%i)==0) {
                count++;
                break;

            }
        }
        if(count==0)
            System.out.println("Prime number");
        else System.out.println("Not a Prime number");
    }
}
