package assisited.practice2;



public class LinkedList

{
	class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public Node head=null;
	public Node tail=null;
	
	public void addNode(int data)
	{
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
		}
		
	}
	public void display()
	{
		Node current=head;
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			while(current!=null)
			{
				System.out.println(current.data);
				current=current.next;
			}
		}
	}
	void deleteNode(int key)
    {
        // Store head node
        Node temp = head, prev = null;
 
        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }
 
        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
 
        // If key was not present in linked list
        if (temp == null)
            return;
 
        // Unlink the node from linked list
        prev.next = temp.next;
    }
	public static void main(String[] args)
	{
		LinkedList s=new LinkedList();
		
		s.addNode(1);
		s.addNode(2);
		s.addNode(5);
		s.addNode(4);
		s.display();
		s.deleteNode(2);
		System.out.println("After deleting: ");
		s.display();
	}

}



