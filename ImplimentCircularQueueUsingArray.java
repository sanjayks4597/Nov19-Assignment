package queue;

class Queue1{
	int []arr;
	int front,size,cap;
	Queue1(int c){
		front=0;
		size=0;
		cap=c;
		arr=new int[cap];
	}
	boolean isFull() {
		return cap==size;
	}
	boolean isEmpty() {
		return size==0;
	}
	int getFront() {
		if(isEmpty())
			return -1;
		else
			return front;
	}
	int getRear() {
		if(isEmpty())
			return -1;
		else
			return (front+1)%cap;
	}
	void enqueue(int x)
	{
		if(isFull())
			return;
		int rear=getRear();
		rear=(rear+1)%cap;
		arr[rear]=x;
		size++;
	}
	void deque() {
		if(isEmpty())
			return;
		else
		{
			front=(front+1)%cap;
			size--;
		}
			
		
	}
}
public class ImplimentCircularQueueUsingArray {

	public static void main(String[] args) {
		
		Queue1 q1=new Queue1(5);
		q1.enqueue(45);
		q1.enqueue(23);
		q1.enqueue(12);
		q1.enqueue(17);
		q1.enqueue(19);
		System.out.println(q1.isFull());
		System.out.println(q1.getFront());
		System.out.println(q1.getRear());
		q1.deque();
		System.out.println(q1.isFull());
		System.out.println(q1.size);
		System.out.println(q1.getFront());

	}

}
