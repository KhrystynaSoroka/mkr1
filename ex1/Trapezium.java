public class Trapezium implements Shape{
    private double C;
    private double H;
    private double D;

    public Trapezium(double c, double h, double d) {
        this.C = c;
        this.H = h;
        this.D = d;
    }
    @Override
    public double getArea(){
        return ((C+D)*H)/2;
    }
}
