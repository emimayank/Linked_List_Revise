
public class SumList {
	public int val;
	public SumList next;
	public SumList(int val){
		this.val=val;
		next=null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumList l1=new SumList(2);
		SumList l2=new SumList(4);
		SumList l3=new SumList(3);
		l1.next=l2;
		l2.next=l3;
		
		SumList m1=new SumList(5);
		SumList m2=new SumList(6);
		SumList m3=new SumList(4);
		m1.next=m2;
		m2.next=m3;
		
		int sum=0,carr=0,val=0;
		SumList curr=null, next=null,head=null;
		while(l1!=null || m1!=null){
			val=l1.val+m1.val+carr;
			l1=l1.next;
			m1=m1.next;
			if(val>=10){
				sum=val%10;
				carr=val/10;
			}
			else{
				sum=val;
				carr=0;
			}
			if(head==null){
				head=new SumList(sum);
				curr=head;
			}
			else if(curr.next==null){
				curr.next=new SumList(sum);
				curr=curr.next;
			}
			
		}
		while(head!=null){
			System.out.println(head.val);
			head=head.next;
		}
	}

}
