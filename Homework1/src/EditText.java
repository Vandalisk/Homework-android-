/**
 * Created by Ilya on 30.09.2014.
 */
public class EditText<T> implements OnClickListener{// extends Button  {
    private OnClickListener listener;




    public void add(String a) {

    }
    public void remove() {

    }

    @Override
    public void onClick() {
        if (listener != null) {
            listener.onClick();
        }
    }
}
