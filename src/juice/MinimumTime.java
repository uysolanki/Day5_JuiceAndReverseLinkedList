package juice;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimumTime {
	static int seconds;
	PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Qunatity of Mango Juices");
		pq.add(sc.nextInt());
		System.out.println("Please Enter Qunatity of Orange Juices");
		pq.add(sc.nextInt());
		System.out.println("Please Enter Qunatity of PineApple Juices");
		pq.add(sc.nextInt());
		
	}
	public void calculate() {
		Iterator<Integer> list=pq.iterator();  //3 0 0
		int val1,val2;
		while(!pq.isEmpty())
		{
			val1=0;
			val2=0;
			
			if(list.hasNext())		//val1 			val2		seconds
			val1=pq.remove();		//0				0			0
									//3				0			3
			if(list.hasNext())		//				 			
			val2=pq.remove();								
															
			if(val1>0  && val2>0)							
			{												
				val1--;
				val2--;
				seconds++;
			}
			
			if(val1>0)
				pq.add(val1);
			if(val2>0)
				pq.add(val2);
			
			if(val1>0  && val2==0)
			{
				seconds=seconds+val1;
				break;
			}
			
			if(val1==0  && val2>0)
			{
				seconds=seconds+val2;
				break;
			}
		}
		
		System.out.println("Minimum time take is : "+seconds);
		
	}

}
