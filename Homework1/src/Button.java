/**
 * Created by Ilya on 30.09.2014.
 */
public class Button extends View implements OnClickListener{

    private OnClickListener listener;
    public Button(){

    }

    public Button(int left, int right, int top, int bottom, StringBuilder text){
        super(left, right, top, bottom, text);
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


}
