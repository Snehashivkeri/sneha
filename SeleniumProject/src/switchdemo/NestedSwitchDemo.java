package switchdemo;

public class NestedSwitchDemo {
    public static void main(String[] args) {
        //WAP to check the country & state validation

        String country = "India";
        String state = "AP";

        switch(country) {
            case "India":
                System.out.println("Country is:" + country);

                switch(state) {
                    case "KA":
                        System.out.println("Karnataka");
                        break;

                    case "AP":
                        System.out.println("Andhra pradesh");
                        break;
                    default:

                        System.out.println("Invalid state:" + state);
                }
                        break;
                    default:
                        System.out.println("Invalid country:" + country);
                }
        }
    }
