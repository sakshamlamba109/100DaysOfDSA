  public static int lca(Node node, int d1, int d2)
 {
      if(d1<node.data && d2<node.data)
      {
          return lcs(node.left,d1,d2);
      }
      else if(d1>node.data && d2>node.data)
      {
          return lca(node.right, d1, d2);
      }
      else
      {
          return node.data;
      }
    
  }