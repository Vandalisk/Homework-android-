/**
 * Created by Ilya on 30.09.2014.
 */
public class EditText<T> extends View implements OnClickListener {
    private OnClickListener listener;

    public EditText(){

    }

    public EditText(int left, int right, int top, int bottom, StringBuilder text){
        super(left, right, top, bottom, text);
    }

    public void change(String a, String b){
        if(a.equals("add")){
            this.getText().append(b);
        }
        if(a.equals("clear")){
            this.setText(null);
        }
    }

    @Override
    public void onClick() {
        if(listener != null){
            listener.onClick();
        }
    }
}
