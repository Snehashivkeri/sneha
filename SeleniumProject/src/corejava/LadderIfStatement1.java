package corejava;

public class LadderIfStatement1 {
    public static void main(String[] args) {
        //WAP to validate the exam results based on marks ?

        int marks = 65;
        if((marks>=85) && (marks<=100)) {
            System.out.println("DISTINTION");
        }
     else if((marks>=60) && (marks<=84)) {
            System.out.println("FIRST CLASS");
        }
        else if((marks>=45) && (marks<=59)) {
            System.out.println("SECOND CLASS");
        }
        else if((marks>=35) && (marks<=44)) {
            System.out.println("PASS");
        }
        else if((marks<0) && (marks>100)) {
            System.out.println("Invalid marks range for the exam:" + marks);
        }
        else {
            System.out.println("FAILED");
        }
    }
}
