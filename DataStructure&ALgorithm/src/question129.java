class Node5
{
    int data;
    Node5 next;
}
public class question129 {
    public static void removeLoop(Node5 head){
        Node5 temp=new Node5();
        while(head!=null){
            if(head.data==-1){
                temp.next=null;
                return ;
            }else{
                temp=head;
                head.data=-1;
                head=head.next;
            }
        }
    }

    public static void main(String[] args) {
    }
}
