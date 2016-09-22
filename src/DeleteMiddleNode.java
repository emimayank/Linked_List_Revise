
public class DeleteMiddleNode {
	public int val;
	public DeleteMiddleNode next;
	public DeleteMiddleNode(int val, DeleteMiddleNode next){
		this.val=val;
		this.next=next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteMiddleNode l10=new DeleteMiddleNode(10,null);
		DeleteMiddleNode l9=new DeleteMiddleNode(9,l10);
		DeleteMiddleNode l8=new DeleteMiddleNode(8,l9);
		DeleteMiddleNode l7=new DeleteMiddleNode(7,l8);
		DeleteMiddleNode l6=new DeleteMiddleNode(6,l7);
		DeleteMiddleNode l5=new DeleteMiddleNode(5,l6);
		DeleteMiddleNode l4=new DeleteMiddleNode(4,l5);
		DeleteMiddleNode l3=new DeleteMiddleNode(3,l4);
		DeleteMiddleNode l2=new DeleteMiddleNode(2,l3);
		DeleteMiddleNode l1=new DeleteMiddleNode(1,l2);
		DeleteMiddleNode nex=l5.next,start=l1;
		l5.val=nex.val;
		l5.next=nex.next;
		while(start!=null){
			System.out.println(start.val);
			start=start.next;
		}
	}

}
