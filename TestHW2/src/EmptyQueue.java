/**
 * Created by Saahil on 11/9/2015.
 */
public class EmptyQueue implements IQueue{
    @Override

    public IQueue enqueue(int elt) {
        return new Queue(elt);
    }

    @Override
    public IQueue dequeue() {
        return null;
    }

    @Override
    public int front() {
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
