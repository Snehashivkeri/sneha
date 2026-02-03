package corejava;

public class IfAndElseStatement {
    public static void main(String[] args) {
        // WAP to check that person is elgible for voting ?
        int age = 101;
        if((age>=18) && (age<=100)) {
            System.out.println("Eligible for voting :" + age);
        }  else {
            System.out.println("Not eligible for voting:" + age);

            }

        }
    }

