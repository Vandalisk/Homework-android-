/**
 * Created by Ilya on 30.09.2014.
 */
public class View {
    private int left;
    private int right;
    private int top;
    private int bottom;

    public View(){

    }

    public View(int left, int right, int top, int bottom){
        this.setLeft(left);
        this.setRight(right);
        this.setTop(top);
        this.setBottom(bottom);

    }


    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }



    public void setLeft(int left) {
        this.left = left;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

}
