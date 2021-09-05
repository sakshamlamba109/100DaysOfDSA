 public static Node createLeftCloneTree(Node node)
  
  {
      if(node==null)
      {
          return null;
      }
      
      Node lc=createLeftCloneTree(node.left);
      Node rc=createLeftCloneTree(node.right);
      
      node.right=rc;
      Node nn=new Node(node.data,lc,null);
      node.left=nn;
      
      
      return node;
      
  }
  