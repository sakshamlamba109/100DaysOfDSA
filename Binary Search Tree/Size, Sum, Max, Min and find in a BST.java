 public static int size(Node node) {
    if(node==null)
    {
        return 0;
    }
    int ls=size(node.left);
    int rs=size(node.right);
    int ts=ls+rs+1;
    return ts;
  }

  public static int sum(Node node) {
    if(node==null)
    {
        return 0;
    }
    int ls=sum(node.left);
    int rs=size(node.right);
    int ts=ls+rs+node.data;
    return ts;
  }

  public static int max(Node node) {
    if(node.right!=null)
    {
        return max(node.right);
    }
    else
    {
        return node.data;
    }
  }

  public static int min(Node node) {
    if(node.left!=null)
    {
        return min(node.left);
    }
    else
    {
        return node.data;
    }
  }

  public static boolean find(Node node, int data){
      if(node==null)
      {
          return false;
      }
    if(data>node.data)
    {
        return find(node.right,data);
    }
    else if(data<node.data)
    {
        return find(node.left,data);
    }
    else
    {
        return true;
    }
  }  