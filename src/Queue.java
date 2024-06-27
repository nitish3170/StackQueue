class QueueNode<T>{
    T data;
    QueueNode<T> next;
    QueueNode(T val){
        this.data=val;
        this.next=null;
    }
}
public class Queue<T> {
    private QueueNode<T> front;
    private QueueNode<T> rear;


    public Queue() {
        this.front = null;
        this.rear = null;
    }
    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enqueue(70);
        queue.enqueue(30);
        queue.enqueue(56);
        queue.display();
//        queue.deQueue();
//        queue.display();
    }
    public void enqueue(int val){
        QueueNode<T> newNode=new QueueNode(val);
        if(rear==null){
            front=rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }
//    public T deQueue(){
//        if (front==null){
//            return null;
//        }
//        T data=front.data;
//        front=front.next;
//        if (front == null) {
//            rear = null;
//        }
//        return data;
//    }
//    public T peek(){
//        if (front==null){
//            return null;
//        }
//        return front.data;
//    }
//    public boolean isEmpty(){
//        return rear==null;
//    }
//    public int size(){
//        if (front==null) return 0;
//        int c=0;
//        QueueNode<T> check=front;
//        while (check!=null){
//            c++;
//            check=check.next;
//        }
//        return c;
//    }
    public void display(){
        if (front==null) System.out.println("Stack is empty");
        QueueNode<T> curr=front;
        while (curr!=null){
            System.out.print(curr.data+"  ");
            curr=curr.next;
        }
        System.out.println();
    }

}