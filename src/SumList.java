
public class SumList {
	public int val;
	public SumList next;
	public SumList(int val, SumList next){
		this.val=val;
		this.next=next;
	}
	public SumList(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumList l3=new SumList(6,null);
		SumList l2=new SumList(1,l3);
		SumList l1=new SumList(7,l2);
		
		SumList m3=new SumList(2,null);
		SumList m2=new SumList(9,m3);
		SumList m1=new SumList(5,m2);
		
		SumList res=new SumList(0,null);
		int carr=0;
		//SumList start=res;
		while(l1!=null){
			SumList inter=new SumList();
			int sum=m1.val+l1.val+carr;
			if(sum>=10){
				res.val=sum%10;
				carr=sum/10;
			}
			else{
				res.val=sum;
				carr=0;
			}
			res.next=inter;
			//next=res;
			m1=m1.next;
			l1=l1.next;
		}
		System.out.println("Something");
	}
	
}
