 private static Node getTail(Node node)
  {
      while(node.children.size()>0)
      {
          node=node.children.get(0);
      }
      return node;
  }

  public static void linearize(Node node){
    for(Node child:node.children)
    {
        linearize(child);
    }
    
    while(node.children.size()>1)
    {   
        Node ln=node.children.remove(node.children.size()-1);
        Node sln=node.children.get(node.children.size()-1);
        Node gt=getTail(sln);
        gt.children.add(ln);
    }
  }