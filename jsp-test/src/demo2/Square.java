package demo2;

public class Square {
    public Square(){}
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int  SquareLength(){
    return 2*(length+width);

}
    public int SquareArea(){
        return length*width;
    }
}


