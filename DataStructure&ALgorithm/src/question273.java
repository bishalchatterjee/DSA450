import java.util.ArrayList;

class MyStack{
    //Implement Stacks From Scratch
    //ArrayList Implementation of stacks
   static ArrayList<Integer> al=new ArrayList<>();

    //custom push function of stack
    static void push(int x){
        al.add(x);
    }

    static int pop(){
        int n=al.size()-1;
        int res=al.get(n);
        al.remove(n);
        return res;
    }

    static int peek(){
        int n=al.size()-1;
        return al.get(n);
    }

    static int size(){
        return al.size();
    }

    boolean isEmpty(){
        return al.isEmpty();
    }
}
public  class question273 {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}


/*
//Array Implementation of Stack

class MyStack{
    int arr[];
    int cap;
    int top;
    MyStack(int c){
        top=-1;
        cap=c;
        arr=new int [cap];

    }

    void push(int x){
        if(top==cap-1){System.out.println("Stack is full");return;}
        top++;
        arr[top]=x;
    }

    int pop(){
        if(top==-1){System.out.println("Stack is Empty");return Integer.MIN_VALUE;}
        int res=arr[top];
        top--;
        return res;
    }

    int peek(){
        if(top==-1){System.out.println("Stack is Empty");return Integer.MIN_VALUE;}
        return arr[top];
    }

    int size(){
        return (top+1);
    }

    boolean isEmpty(){
        return top==-1;
    }
}

 */


/*
//Linked List Implementation of Stacks

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

class MyStack{
    Node head;
    int sz;
    MyStack(){
        head=null;
        sz=0;
    }

    void push(int x){
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        sz++;
    }

    int pop(){
        if(head==null){return Integer.MAX_VALUE;}
        int res=head.data;
        Node temp=head;
        head=head.next;
        sz--;
        return res;
    }

    int peek(){
        if(head==null){return Integer.MAX_VALUE;}
        return head.data;
    }

    int size(){
        return sz;
    }

    boolean isEmpty(){
        return head==null;
    }
}

 */
