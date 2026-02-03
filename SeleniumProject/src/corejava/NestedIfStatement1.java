package corejava;

public class NestedIfStatement1 {
    public static void main(String[] args) {
        //WAP to check the state code based on country ?

        String country = "USA";
        String state = "Karnataka";

        if(country.equals("India")) {
            if(state.equals("Karnataka")) {
                System.out.println("KA");
            } else if(state.equals("Tamil nadu")) {
                System.out.println("TN");
            } else if(state.equals("Andhra pradesh")) {
                System.out.println("AP");
            } else {
                System.out.println("Invalid state");
            }

        }
    }
}
