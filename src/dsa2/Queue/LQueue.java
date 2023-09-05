package dsa2.Queue;

public class LQueue {

    public QNode front;
    public QNode rear;

    public LQueue(){
        this.front=null;
        this.rear=null;
    }

    public void enQueue(int data){
        QNode newNode=new QNode(data);
        if(front==null){
            front=rear=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;
        }

    }

    public void deQueue(){
        if(front==null){
            System.out.println("Queue is empty");
        }else{
            front=front.next;

        }

    }

    public void show(){
        QNode temp=front;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }


}
