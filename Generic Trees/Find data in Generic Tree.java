public static boolean find(Node node, int data) 
  {
    if(node.data==data)
    {
        return true;
    }
    for(Node child:node.children)
    {
        boolean temp=find(child,data);
        if(temp==true)
        {
            return temp;
        }
    }
    return false;
  }