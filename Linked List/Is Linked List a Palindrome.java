private boolean IsPalindromeHelper(Node right)
{
    if(right==null)
    {
    
        return true;
    }
    boolean res=IsPalindromeHelper(right.next);
    
    if(res==false)
    {
        return false;
    }
    else if(right.data==left.data)
    {
        left=left.next;
        return true;
    }
   
}

Node left=null;
public boolean IsPalindrome() 
{
     left=head;
     boolean temp=IsPalindromeHelper(head);
     return temp;
      
}