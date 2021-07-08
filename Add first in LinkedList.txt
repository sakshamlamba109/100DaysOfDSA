public void AddFirst(val)
{Node value=new Node();
  value.data=val;
   if(size==0)
{ head=tail=value;
  size++;
}
else
{ Node temp=head;
  value.next=temp;
  head=value;
  size++;
}
}
