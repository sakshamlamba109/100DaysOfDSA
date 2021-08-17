  static int maxnode=0;
  static int maxsum=Integer.MIN_VALUE;
  public static int large(Node node)
  {   int sum=0;
      for(Node child:node.children)
      {
          int cm=large(child);
          sum+=cm;
      }
      sum+=node.data;
      if(sum>maxsum)
      {
          maxnode=node.data;
          maxsum=sum;
      }
      return sum;
  }