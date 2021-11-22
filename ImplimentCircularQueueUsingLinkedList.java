package queue;

class Node{
	int data;
	Node next;
	Node(int x)
	{
		data=x;
		next=null;
	}
	
}
class Queue2{
	Node front,rear;
	int size;
	Queue2()
	{
		front=rear=null;
		size=0;
	}
	
	void enqueue(int x)
	{
		Node temp=new Node(x);
		if(front==null)
		{
			rear=front=temp;
			size++;
			return;
		}
		rear.next=temp;
		rear=temp;
		size++;
	}
	void dequeue() {
		if(front==null)
			return;
		
		front=front.next;
		size--;
		if(front==null)
		{
			rear=null;
		}
		
	}
}

public class ImplimentCircularQueueUsingLinkedList {

	public static void main(String[] args) {
		
		Queue2 Q1=new Queue2();
		Q1.enqueue(8);
		System.out.println(Q1.size);
		Q1.enqueue(5);
		System.out.println(Q1.rear.data);
		System.out.println(Q1.size);
		Q1.dequeue();
		System.out.println(Q1.size);
	}

}
