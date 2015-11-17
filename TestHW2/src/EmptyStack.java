/**
 * Created by Saahil on 11/9/2015.
 */
public class EmptyStack implements IStack {
    @Override
    public IStack push(int elt) {
        return new Stack(elt);
    }

    @Override
    public IStack pop() {
        return null;
    }

    @Override
    public int top() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }
    public String toString()
    {
        return "";
    }
}
