private static void foldHelp(Node right, int t)
{   
     if(right==null)
        
     { 

       return;
     
     }

     foldHelp(right.next, t+1);
 
     if(t>size/2)

    {
     
      Node temp=left;
      left=left.next;
      temp.next=right;
      right.next=temp;

    }
     
    else if(t==size/2)

    {
   
       tail=right;
       right.next==null;
   
     }

}

Node left=null;

public static void fold()
{
  left=head;
  foldHelp(head,0);
}



       