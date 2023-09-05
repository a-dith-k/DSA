package dsa2.stack;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class LStack {
    public Node top;
    LStack(){
        this.top=null;
    }


    public void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
           top=newNode;
        }else{
            newNode.next=top;
            top=newNode;
        }
    }

    public int pop(){
        int data;
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }else{
            data=top.data;
            top=top.next;
        }
        return data;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("empty");
            return -1;
        }
        return top.data;
    }


    public boolean isEmpty(){
        return top==null;
    }

}
