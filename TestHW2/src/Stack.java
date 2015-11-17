public class Stack implements IStack {
    int val;
    IStack next;
    Stack(int elt)
    {
        this.val=elt;
        this.next = new EmptyStack();
    }
    public IStack push(int elt) {
        Stack s = new Stack(elt);
        s.next = this;
        return s;
    }
    public IStack pop() {return this.next;}
    public int top() {return val;}
    public boolean isEmpty() {return false; }
    public String toString()
    {
        return "" + val + this.next + " ";
    }
}
