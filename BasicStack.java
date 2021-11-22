package Stack;
class Stack{
	
	int []x=new int[10];
	int size=0;
	
	void push(int f)
	{
		if(size<x.length)
		{
			x[size++]=f;
		}
		else {
			System.out.println("overflow");
		}
	}
	void pop() {
		
		if(size!=-1)
		{
			size=size-1;
		}
		else
		{
			System.out.println("underflow");
		}
	}
	int peak() {
		if(size!=-1)
		{
			return x[size-1];
		}
		else {
			return -1;
		}
	}
	int avg()
	{
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+x[i];
		}
		return sum/size;
	}
	int getMax() {
		int max=0;
		for(int i=0;i<size;i++)
		{
			if(x[i]>max)
			{
				max=x[i];
			}
		}
		return max;
	}
	
}
public class BasicStack {

	public static void main(String[] args) {
		
		Stack stk=new Stack();
		stk.push(4);
		stk.push(9);
		stk.push(45);
		
		System.out.println(stk.peak());
		
//		System.out.println(stk.peak());
		System.out.println(stk.avg());
		System.out.println(stk.getMax());
		stk.pop();
		System.out.println(stk.peak());
		System.out.println(stk.avg());
		System.out.println(stk.getMax());
		
	}

}
