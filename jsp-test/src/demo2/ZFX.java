package demo2;

public class ZFX {
    public ZFX(){}
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    public int ZFXlength(){
        return 4*side;
    }
    public int ZFXarea(){
        return side*side;
    }
}
