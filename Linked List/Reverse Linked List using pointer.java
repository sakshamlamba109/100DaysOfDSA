 private void reversePRHelper(Node node)
    {
      if(node.next==null)
      {
          return;
      }
      reversePRHelper(node.next);
      
      if(node==tail)
      {
          
      }
      else
      {
      node.next.next=node;
      }
    }
  
   public void reversePR()
   {
       reversePRHelper(head);
       head.next=null;
       Node temp=head;
       head=tail;
       tail=temp;
       
   }