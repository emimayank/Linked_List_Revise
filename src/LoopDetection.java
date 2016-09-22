
public class LoopDetection {
	public int val;
	public LoopDetection next;
	public LoopDetection(int val, LoopDetection next){
		this.val=val;
		this.next=next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Intersection l5=new Intersection(5,null);
		Intersection l4=new Intersection(4,l5);
		Intersection l3=new Intersection(3,l4);
		Intersection l2=new Intersection(2,l3);
		Intersection l1=new Intersection(1,l2);
		l5.next=l4;
		Intersection slow=l1,fast=l1.next.next;
		while(fast!=slow || slow==null){
			fast=fast.next.next;
			slow=slow.next;
		}
		System.out.println(slow.next.val);
	}

}
