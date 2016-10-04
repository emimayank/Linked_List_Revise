import java.util.LinkedList;
import java.util.Queue;

public class SumListQueueClass {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer>queue1=new LinkedList<Integer>();
		Queue<Integer>queue2=new LinkedList<Integer>();
		queue1.add(2);
		queue1.add(4);
		queue1.add(3);
		
		queue2.add(5);
		queue2.add(6);
		queue2.add(4);
		
		Queue<Integer>res=new LinkedList<Integer>();
		int carr=0;
		while(!queue1.isEmpty()){
			int val=queue1.poll()+queue2.poll();
			if(val>=10){
				res.add((val%10)+carr);
				carr=val/10;
			}
			else{
				res.add(val+carr);
			}
		}
		while(!res.isEmpty()){
			System.out.println(res.poll());
		}
	}
	
}
