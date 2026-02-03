package switchdemo;

public class SwitchAndDefaultDemo1 {
    public static void main(String[] args) {
        //WAP to display the colour code using switch statement

        String color = "black";
        switch(color){
            case "red":
                System.out.println("DANGER");
                break;

            case "white":
                System.out.println("PEACE");
                break;

            case "green":
                    System.out.println("NATURE");
                    break;

            case "blue":
                System.out.println("OCEAN");
                break;

            case "black":
                System.out.println("UNIVERSAL");
                break;
            default:
                System.out.println("Invalid color:" + color);
        }
    }
}
