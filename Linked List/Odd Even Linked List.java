public static void OddEven()
{
  
   LinkedList odd = new LinkedList();
     
   LinkedList even = new LinkedList();

   while(this.size>0)

{

   int val=this.getFirst();

   this.removeFirst;

   if(val%2==0)

{

   even.addLast(val);

}

   else

{
  
   odd.addFirst(val);

}

}

   if(odd.size>0 && even.size>0)

{

   odd.tail.next=even.head;

   this.head=odd.head;

   this.tail=even.tail;

   this.size=odd.size+even.size;

}

  else if(odd.size==0 && even.size>0)

{
   
   this.head=even.head;

   this.tail=even.tail;

   this.size=even.size;

}

  else

{ 
  
  this.head=odd.head;

  this.tail=odd.tail;

  this.size=odd.size;

}

}
  
   