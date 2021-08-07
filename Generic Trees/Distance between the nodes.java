  public static int distanceBetweenNodes(Node node, int d1, int d2)
  {
    ArrayList<Integer> p1 = nodeToRootPath(node, d1); // p1 is the ArrayList that contains the path of the node containing d1 from root
    ArrayList<Integer> p2 = nodeToRootPath(node, d2);// p2 is the ArrayList that contains the path of the node containing d2 from root
    int i = p1.size() - 1;
    int j = p2 .size() - 1;
    
    int temp=lca(node,d1,d2); // temp contains the lowest common ancestor between d1 and d2
                                   
                              // Both nodeToRootPath(node, data); and lca(node,d1,d2); are uploaded previously
    
    while(i>=0 &&j>=0 && p1.get(i)!=temp)
    {
        i--;
        j--;
    }
    return (i+j);
    
  }