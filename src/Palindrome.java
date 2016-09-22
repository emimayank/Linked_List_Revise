import java.util.Stack;

//Author Mayank Shekhar
public class Palindrome {
	public int val;
	public Palindrome next;
	public Palindrome(int val, Palindrome next){
		this.val=val;
		this.next=next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome l5=new Palindrome(1,null);
		Palindrome l4=new Palindrome(2,l5);
		Palindrome l3=new Palindrome(3,l4);
		Palindrome l2=new Palindrome(2,l3);
		Palindrome l1=new Palindrome(1,l2);
		Palindrome start=l1;
		//Palindrome rev=palin_reverse(start);
		Palindrome slow=l1;
		Palindrome fast=l1;
		Stack<Integer> st = new Stack<Integer>();
		while(fast!=null && fast.next!=null){
			st.push(new Integer(slow.val));
			slow=slow.next;
			fast=fast.next.next;
		}
		if(fast!=null){
			slow=slow.next;
		}
		int flag=0;
		while(slow!=null){
			if(!st.empty()){
				if(st.pop()==slow.val){
					slow=slow.next;
				}
				else{
					flag=1;
					break;
				}
			}	
		}
		if(flag==1){
			System.out.println("Not a Palindrome!");
		}
		else{
			System.out.println("Palindrome");
		}
	}


}
