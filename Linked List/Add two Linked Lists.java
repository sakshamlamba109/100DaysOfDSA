 public static int AddTwoHelp( Node one, int size1, Node two, int size2, LinkedList res)
    {  int val=0;
    
        if(one==null && two==null)
    {
        return 0;
    }
    
        if(size1>size2)
        {
            int oc=AddTwoHelp(one.next,size1-1,two,size2,res);
            val=one.data+oc;
           
        }
        else if(size1<size2)
        {
            int oc=AddTwoHelp(one.next,size1,two.next,size2-1,res);
             val=two.data+oc;
            
        }
        else
        {
            int oc=AddTwoHelp(one.next,size1-1,two.next,size2-1,res);
            val=one.data+two.data+oc;
            
        }
            int og=val%10;
            int adcar=val/10;
            res.addFirst(og);
            return adcar;
    }

    public static LinkedList addTwoLists(LinkedList one, LinkedList two) {
        LinkedList res=new LinkedList();
         int oc=AddTwoHelp(one.head,one.size,two.head,two.size,res);
         if(oc>0)
         {
             res.addFirst(oc);
         }
      return res;
    }