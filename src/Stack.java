class Node<T>{
    T data;
    QueueNode<T> next;
    Node(T val){
        this.data=val;
        this.next=null;
    }
}
public class Stack<T> {
    private QueueNode<T> top;

    public Stack() {
        this.top = null;
    }
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.display();
    }
    public void push(int val){
        QueueNode<T> newQueueNode =new QueueNode(val);
        newQueueNode.next=top;
        top= newQueueNode;
    }
    public T pop(){
        if (top==null){
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }
        T data=top.data;
        top=top.next;
        return data;
    }
    public T peek(){
        if (top==null){
            throw new RuntimeException("Stack is empty. Cannot peek.");
        }
        return top.data;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public int size(){
        if (top==null) return 0;
        int c=0;
        QueueNode<T> check=top;
        while (check!=null){
            c++;
            check=check.next;
        }
        return c;
    }
    public void display(){
        if (top==null) System.out.println("Stack is empty");
        QueueNode<T> curr=top;
        while (curr!=null){
            System.out.print(curr.data+"  ");
            curr=curr.next;
        }
    }

}