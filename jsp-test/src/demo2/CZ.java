//try catch抛出异常的快捷键CTRL+ALT+t
package demo2;

public class CZ {
    public CZ() {
    }

    private double a, b, c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void Triangular1() {
        double L;
        L = a + c + b;
        if (a + b > c || a + c > b || c + b > b) {
            System.out.println(L);
        } else {
            System.out.println("不能构成三角形");
        }

    }
}
