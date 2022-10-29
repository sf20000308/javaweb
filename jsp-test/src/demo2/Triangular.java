package demo2;


import java.io.Serializable;

public class Triangular {
    public Triangular(){
    }
    private double a,b,c;
    public String L;

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
//    public double Triangular1( ){
//        double L;
//        L=a+c+b;
//        if (a+b>c||a+c>b||c+b>b){
//            System.out.println(L);
//        }else{
//            System.out.println("不能构成三角形");
//        };
//        return L;
//    }
    public String Triangularlength(){
        

        if (a+b>c&&a+c>b&&c+b>a){
            L=" "+(a+c+b);

        }else{
              L= "不能构成三角形";


        }
        return L;
    }

    public String Triangulararea(){
        String S;
        double p;
        if (a+b>c&&a+c>b&&c+b>a){
            p=0.5*(a+c+b);
            S=" "+(Math.sqrt(p*(p-a)*(p-c)*(p-b)));


        } else {
            S="不能构成三角形";
            

        }
        return S;
    }
    
}
