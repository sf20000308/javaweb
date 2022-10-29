package demo2;

public class Circle {
    public Circle(){}
    private double R;

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }
    public double Rlength(){
        return 4*Math.PI*R;
    }
    public double Rarea(){
        return Math.PI*R*R;
    }
}
