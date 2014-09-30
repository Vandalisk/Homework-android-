import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ilya on 30.09.2014.
 */
public class Stack<T> {
    private T object;
    private int size;
    private List <T> stack;

    public Stack(){
        stack = new ArrayList<T>();
    }


    public T pop(){
        size --;
        return stack.get(size);
    }
    public void push(T a){
        stack.add(a);
        size++;
    }
}
