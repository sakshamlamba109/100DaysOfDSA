public static void printKNodesFar(Node node, int data, int k) {
    path=new ArrayList<>();
    find(node,data);
    for(int i=0;i<path.size();i++)
    {
        printKLevelsDown(path.get(i),k-i,i==0? null:path.get(i-1));
    }
  }



 public static void printKLevelsDown(Node node, int k,Node blocker)  //Print K-Levels Down
{
    if(node==null || k<0 || node==blocker)
    {
        return;
    }
        
   if(k==0)
   {
       System.out.println(node.data);
      
   }
   
   printKLevelsDown(node.left,k-1,blocker);
   printKLevelsDown(node.right,k-1,blocker);
      
}


static ArrayList<Node> path;
  public static boolean find(Node node, int data) //Node-To-Root-Path
 {  
      if(node==null)
  {
      return false;
  }
  if(node.data==data)
  {   path.add(node);
      return true;
  }
  
  boolean lr=find(node.left,data);
  {
      if(lr==true)
      {   path.add(node);
          return true;
      }
  }
  boolean tr=find(node.right,data);
  {
      if(tr==true)
      {   path.add(node);
          return true;
      }
  }
  return false;
 }