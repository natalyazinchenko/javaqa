import java.sql.SQLOutput;

public class ata {

public static void main(String [] args) {
    hello("world");
    hello("user");
    hello("Natasha");

    Square s = new Square(5);
    Rectangle r = new Rectangle(4,6);
    System.out.println("Square " + s.l + " equals: " + s.area());
    System.out.println("Square pryamougolnika so storonami " + r.a + " i " + r.b + " ravno " + r.areasq());
}

public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
}

}