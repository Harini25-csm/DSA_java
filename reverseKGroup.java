class reverseKGroup{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;

    void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    Node reverse(Node head, int k){
        Node curr=head;
        int count=0;
        while(curr!=null &&count<k){
            curr=curr.next;
            count++;
        }
        if(count==k){
            Node prev=null;
            curr=head;
            Node next=null;
        
            for(int i=0;i<k;i++){
                next=curr.next;//save the next node
                curr.next=prev;//reverse the linkedlist
                prev=curr; //move prev
                curr=next;//move current

            }
            if(curr!=null){
                head.next=reverse(curr,k);
            }
        
            return prev;
        }
        return head;
    }

    void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String []args){
        reverseKGroup list=new reverseKGroup();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8
            
        );
        int k=3;

        System.out.println("Original List:");
        list.printList();

        list.head = list.reverse(list.head, k);


        System.out.println("\nReversed List:");
        list.printList();
    }
    
}