  static int sum = 0;
  public static void rwsol(Node node){
      if(node==null)
      {
          return;
      }
    rwsol(node.right);
    int od=node.data;
    node.data=sum;
    sum+=node.data;
    rwsol(node.left);
  }