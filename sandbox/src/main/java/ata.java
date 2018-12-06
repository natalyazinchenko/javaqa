public class ata {

public static void main(String [] args) {
    hello("world");
    hello("user");
    hello("Natasha");

    double len = 5;
    System.out.println("Square " + len + " equals: " + area(len));

    double a = 4;
    double b = 6;
    System.out.println("Square pryamougolnika so storonami " + a + " i " + b + " ravno " + areasq(a,b));
}

public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
}

public static double area(double l) {
    return l * l;
}

public static double areasq(double a, double b) {
    return a * b;
}
}