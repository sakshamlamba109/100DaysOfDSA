public void removeduplicate()
{
  LinkedList temp=new LinkedList();
  
  while(this.size>0)
{
   int val=this.getdata();
    
   this.removedata();

   if(temp.size==0||temp.tail.data!=val)

      { 

        temp.addLast(val);
      
       }


   }
 
   this.head=temp.head;
   
   this.tail=temp.tail;

   this.size=temp.size;

}