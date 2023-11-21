package rectEncap;

public class RectInput {
    private int length;
    private int breadth;

    void Rectangle (int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setLength(int length){
        this.length=length;
    }
    public void setBreadth(int breadth){
        this.breadth=breadth;
    }
}