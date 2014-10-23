/**
 * Created by Ilya on 30.09.2014.
 */
public class Button extends TextView implements OnClickListener{

    private OnClickListener listener;

    public Button(int left, int right, int top, int bottom, String text){
        super(left, right, top, bottom, text);
    }

    public void setOnClickListener(OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onClick() {
        if(listener != null){
            listener.onClick();
        }
    }


}
