public class Points {

    public static double distance(double p1, double p2){
        return p2-p1;

    }

    public static void main(String[] args){
        Points points = new Points();
        System.out.println("Distance between two points - " + distance(10.54,53.64));
    }
}
