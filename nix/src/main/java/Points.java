public class Points {

    double p1;
    double p2;

    public double distance(double p1, double p2){
        this.p1 = p1;
        this.p2 = p2;
        return p2-p1;

    }

    public static void main(String[] args){
        Points points = new Points();
        System.out.println("Distance between two points - " + points.distance(10.54,53.64));
    }
}
