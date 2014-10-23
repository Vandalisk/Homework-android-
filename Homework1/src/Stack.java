import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ilya on 30.09.2014.
 */
public class Stack<T> {
    private LinkedList <T> stack;

    public Stack(){
        stack = new LinkedList<T>();
    }


    public T pop(){
        return stack.getLast();
    }
    public void push(T a){
        stack.add(a);
    }
}
