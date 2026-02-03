package practice;

abstract class Car {
    public abstract void drive();

    public void playMusic() {
           System.out.println("music");
    }

    }

    class WagonR extends Car {
     public void drive() {
         System.out.println("driving");
     }
     public void playMusic() {
         System.out.println("playing music");
     }
    }
public class abstractClassDemo {
    public static void main(String[] args) {
       Car obj = new WagonR();
       obj.drive();
       obj.playMusic();
    }
}
