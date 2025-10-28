import mypack.util.Myclass;
import mypack.util.mypackage.Constructor;

public class Testdefault {
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.display();

        Constructor cons = new Constructor(10);
        cons.display();
    }
}
