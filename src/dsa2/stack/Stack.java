package dsa2.stack;


public class Stack {

    int top=0;
    int[] stack=new int[10];

    public void push(int data){
        if(top==10){
            System.out.println("Overflow");
        }else{
            stack[top]=data;
            top++;
        }

    }

    public String pop(){
        top--;

        if(top==-1){
            top++;
            return "underflow";

        }
        int data=stack[top];
        stack[top]=0;
        return String.valueOf(data);

    }

    public void peek(){
        System.out.println(stack[top-1]);
    }

    public int size(){

        return top;
    }

    public boolean isEmpty(){

        return size()==0;
    }

    public void show(){
        for(int i : stack){
            System.out.println(i);
        }
    }
}
