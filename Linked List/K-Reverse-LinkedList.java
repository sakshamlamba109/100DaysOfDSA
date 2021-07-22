 public void kReverse(int k)
    {
      LinkedList temp=null;
      while(this.size>0)
     { 
        LinkedList curr=new LinkedList();
        int val=0;
        if(this.size>=k)
      { 
         
          for(int i=0;i<k;i++)
        {
            val=this.getFirst();
            this.removeFirst();
            curr.addFirst(val);
        }   
      }      
          else
     {
          int s=this.size;
          for(int i=0;i<s;i++)
          {
            val=this.getFirst();
            this.removeFirst();
            curr.addLast(val);
           }         
      }
      
    if(temp==null)
    {
        temp=curr;
    }
    else
    {
        temp.tail.next=curr.head;
        temp.tail=curr.tail;
        temp.size+=curr.size;
    }
  }
    this.head=temp.head;
    this.tail=temp.tail;
    this.size=temp.size;
  }