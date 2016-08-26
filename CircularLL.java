public class CircularLL {

	public Boolean isCircular(Node head)
	{
       Node slow=head;
       Node fast=head;
while(fast!=null && fast.next!=null)
{
	slow=head.next;
	fast=head.next.next;
	
	if(slow==fast)
		return true;
}
	return false;
	}
	
}
