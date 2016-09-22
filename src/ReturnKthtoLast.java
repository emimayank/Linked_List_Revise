
public class ReturnKthtoLast {
	public int val;
	public ReturnKthtoLast next;
	public ReturnKthtoLast(int val, ReturnKthtoLast next){
		this.val=val;
		this.next=next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnKthtoLast l10=new ReturnKthtoLast(10,null);
		ReturnKthtoLast l9=new ReturnKthtoLast(9,l10);
		ReturnKthtoLast l8=new ReturnKthtoLast(8,l9);
		ReturnKthtoLast l7=new ReturnKthtoLast(7,l8);
		ReturnKthtoLast l6=new ReturnKthtoLast(6,l7);
		ReturnKthtoLast l5=new ReturnKthtoLast(5,l6);
		ReturnKthtoLast l4=new ReturnKthtoLast(4,l5);
		ReturnKthtoLast l3=new ReturnKthtoLast(3,l4);
		ReturnKthtoLast l2=new ReturnKthtoLast(2,l3);
		ReturnKthtoLast l1=new ReturnKthtoLast(1,l2);
		ReturnKthtoLast start1=l1,start2=l1;
		int k=3,size=0;
		while(start1!=null){
			size++;
			start1=start1.next;
		}
		int index=size-k;
		while(start2!=null){
			if(index!=1){
				index--;
				start2=start2.next;
			}
			else{
				System.out.println(start2.val);
				break;
			}
		}
	}

}
