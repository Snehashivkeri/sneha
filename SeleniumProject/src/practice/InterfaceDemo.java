package practice;

interface A {
  public void show();
  public void config();
}
    class B implements A {
    public void show() {
        System.out.println("In show");
    }
    public void config() {
        System.out.println("In config");
    }
    }

public class InterfaceDemo {
    public static void main(String[] args) {

        A obj;
        obj= new B();
        obj.show();
        obj.config();

    }
}
