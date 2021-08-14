static int ceil; //Initialise  ceil = Integer.MAX_VALUE in the main function
static int floor; //Initialise  floor = Integer.MIN_VALUE in the main function

public static void ceilAndFloor(Node node, int data) 
  {
     if(node.data<data)
     {
         floor=Math.max(floor,node.data);
     }
     else if(node.data>data)
     {
         ceil=Math.min(ceil,node.data);
     }
     for(Node child: node.children)
     {
         ceilAndFloor(child,data);
     }
  }