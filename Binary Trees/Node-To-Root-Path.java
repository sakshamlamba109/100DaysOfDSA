  static ArrayList<Integer> path;
  public static boolean find(Node node, int data)
 {  
      if(node==null)
  {
      return false;
  }
  else if(node.data==data)
  {   path.add(node.data);
      return true;
  }
  
  boolean lr=find(node.left,data);
  {
      if(lr==true)
      {   path.add(node.data);
          return true;
      }
  }
  boolean tr=find(node.right,data);
  {
      if(tr==true)
      {   path.add(node.data);
          return true;
      }
  }
  return false;
 }
  