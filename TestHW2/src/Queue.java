public class Queue implements IQueue {
    int val;
    IQueue next;
    Queue (int elt)
    {
        this.val = elt;
        this.next = new EmptyQueue();
    }
    @Override
    public IQueue enqueue(int elt) {
        Queue q = new Queue(val);
        q.next = this.next.enqueue(elt);
        return q;
    }

    @Override
    public IQueue dequeue() {
        return this.next;
    }

    @Override
    public int front() {
        return val;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
    public String toString()
    {
        return "" + val + " " + this.next;
    }
}
