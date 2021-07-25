 public static int findIntersection(LinkedList one, LinkedList two){
      Node t1=one.head;
      Node t2=two.head;
      int diff= Math.abs(one.size-two.size);
      if(one.size>two.size)
      {
          for(int i=0;i<diff;i++)
          {
              t1=t1.next;
          }
          else
          {
              for(int i=0;i<diff;i++)
              {
                  t2=t2.next;
              }
          }
          while(t1!=t2)
          {
              t1=t1.next;
              t2=t2.next;
          }
          return t1.data;
      }
    }