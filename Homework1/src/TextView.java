/**
 * Created by Ilya on 30.09.2014.
 */
public class TextView extends View {
    private String text;

    public TextView(int left, int right, int top, int bottom, String text){
        super(left, right, top, bottom);
        setText(text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
