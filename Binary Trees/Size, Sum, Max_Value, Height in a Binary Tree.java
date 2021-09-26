 //SIZE
  public static int size(Node node) {
    int h = 0;
    if (node == null)
    {
      return 0;
    }
    int c = size(node.left);
    h += c;
    int d = size(node.right);
    h += d;
    h += 1;
    return h;
  }


  //SUM
  public static int sum(Node node) {
  int sum=0;
  if(node==null)
  {
      return 0;
  }
  int c=sum(node.left);
  sum+=c;
  int d=sum(node.right);
  sum+=d;
  
  sum+=node.data;
  return sum;
  }


  //MAX VALUE OF THE NODE
  public static int max(Node node) {
    int max=Integer.MIN_VALUE;
    if(node==null)
    {
        return -1;
    }
    int c=max(node.left);
    max=Math.max(c,max);
    int d=max(node.right);
    max=Math.max(d,max);
    max=Math.max(max,node.data);
    return max;
    
  }

  
  //HEIGHT OF A BINARY TREE
  public static int height(Node node)
  {
     int h=-1;
     if(node==null)
     {
         return -1;
     }
     int c=height(node.left);
     h=Math.max(h,c);
     int d=height(node.right);
     h=Math.max(h,d);
     h+=1;
     return h;
  }