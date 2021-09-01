 public static void printKLevelsDown(Node node, int k, int depth)
  {
    if(node==null || k<0)
    {
        return;
    }
        
   if(depth==k)
   {
       System.out.println(node.data);
       return;
   }
   
   printKLevelsDown(node.left,k,depth+1);
   printKLevelsDown(node.right,k,depth+1);
   return;
   
  }