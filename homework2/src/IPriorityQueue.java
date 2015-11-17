public interface IPriorityQueue {
    IPriorityQueue addElt(int elt);
    IPriorityQueue remMinElt();
    int getMinElt();
    boolean isEmpty();
}
