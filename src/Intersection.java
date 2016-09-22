
public class Intersection {
	public int val;
	public Intersection next;
	public Intersection(int val, Intersection next){
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
		
		Intersection m7=new Intersection(7,l3);
		Intersection m6=new Intersection(6,m7);
		int flag=0;
		while(m6!=null && l1!=null){
			if(m6!=l1){
				m6=m6.next;
				l1=l1.next;
			}
			else{
				flag=1;
				break;
			}
		}
		if(flag==1){
			System.out.println("They Intersect!");
		}
		else{
			System.out.println("They don't!");
		}
	}

}
