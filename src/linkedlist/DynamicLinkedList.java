package linkedlist;

import java.util.Scanner;

public class DynamicLinkedList {
	 
	public static void main(String[] args) {
		Node head=null;
		head=create(head);	
		System.out.println("Display after Creation : ");
		display(head);  //10->20->30-NULL
		
		head=addFirst(head);
		System.out.println("Display after Adding first : ");
		display(head);  //40->10->20->30-NULL
		
		addLast(head);
		System.out.println("Display after Adding Last : ");
		display(head);  //40->10->20->30-50->NULL
		
		head=reverse(head);
		System.out.println("Display after Reversal: ");
		display(head); //30->20->10-NULL
		
		
	}
	
	private static void addLast(Node head) {
		Node temp=head;
		Node nn=new Node(50);
		
		while(temp.next!=null)
			temp=temp.next;
		
		temp.next=nn;
	}

	private static Node addFirst(Node head) {
		Node nn=new Node(40);
		nn.next=head;
		head=nn;
		return(head);
	}

	private static Node reverse(Node head)
	{
		Node left=null;
		Node current=head;
		Node right=null;
		while(current!=null)
		{
			right=current.next;
			current.next=left;
			left=current;
			current=right;
		}
		return(left);
	}
	private static void display(Node head) {
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print("NULL");
	}
	private static Node create(Node head) {
		Node temp=null;
		Node nn=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of LL");			//10
		int size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			System.out.println("Enter Data for Node " + i);
			int item=sc.nextInt(); //20
			nn=new Node(item);
			if(head==null)			//first time once
			{
				temp=head=nn;
			}
			else					// 9 time
			{
				temp.next=nn;
				temp=temp.next;
			}
		}
	return(head);	
	}
}
