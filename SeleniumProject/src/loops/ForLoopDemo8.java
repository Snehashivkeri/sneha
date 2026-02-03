package loops;

public class ForLoopDemo8 {
    public static void main(String[] args) {
        //WAP to display the below pattern ?
        //*
        //**
        //***
        //****

        for(int i=1; i<=4; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
