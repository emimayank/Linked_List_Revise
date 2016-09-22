import java.util.HashMap;

public class RemoveDups {
	public int val;
	public RemoveDups next;
	public RemoveDups(int val,RemoveDups next){
		this.val=val;
		this.next=next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDups l5=new RemoveDups(5,null);
		RemoveDups l4=new RemoveDups(4,l5);
		RemoveDups l3=new RemoveDups(1,l4);
		RemoveDups l2=new RemoveDups(1,l3);
		RemoveDups l1=new RemoveDups(1,l2);
		RemoveDups prev=l1,nex=l1.next;
		HashMap<Integer, Integer>map=new HashMap<>();
		map.put(prev.val,1);
		while(nex!=null){			
			if(!map.containsKey(nex.val)){
				map.put(nex.val,1);
				prev=nex;
				nex=nex.next;
			}
			else{
				prev.next=nex.next;
				nex=nex.next;
			}
		}
		while(l1!=null){
			System.out.println(l1.val);
			l1=l1.next;
		}
	}

}
