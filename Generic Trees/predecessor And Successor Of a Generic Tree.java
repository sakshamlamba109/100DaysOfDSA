  static Node predecessor;
  static Node successor;
  static int state;
  public static void predecessorAndSuccessor(Node node, int data) 
{
   if(state==0)
   {
       if(node.data==data)
       {
           state++;
       }
       else
       {
           predecessor=node;
               
       }
   }
   else if(state==1)
   {
       successor=node;
       state++;
   }
   
   for(Node child:node.children)
  { 
    predecessorAndSuccessor(child,data);
  }
  
}