/**
 * Created by Ilya on 30.09.2014.
 */
public class Button implements OnClickListener{
    private int left;
    private int right;
    private int top;
    private int bottom;
    private String text;
    private OnClickListener listener;

    public Button(){

    }

    public Button(int left, int right, int top, int bottom, String text){
        this.setLeft(left);
        this.setRight(right);
        this.setTop(top);
        this.setBottom(bottom);
        this.setText(text);
    }

    public Button(String text){
        this.setText(text);
    }
    public void setL(OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onClick() {
        if(listener != null){
            listener.onClick();
        }
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
