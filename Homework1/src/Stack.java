import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ilya on 30.09.2014.
 */
public class Stack {
    private int size;
    private ArrayList <Integer> stack;

    public Stack(){
        stack = new ArrayList<Integer>();
    }


    public int pop(){
        size --;
        return stack.get(size);
    }
    public void push(int a){
        stack.add(a);
        size++;
    }
}
