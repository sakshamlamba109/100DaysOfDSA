  static int ceil;
  static int floor;
  public static void ceilAndFloor(Node node, int data) {
    if(node.data > data){
      if(node.data < ceil){
        ceil = node.data;
      }
    }

    if(node.data < data){
      if(node.data > floor){
        floor = node.data;
      }
    }

    for (Node child : node.children) {
      ceilAndFloor(child, data);
    }
  }

 public static int kthLargest(Node node, int k)
 {
    floor=Integer.MIN_VALUE;
    int temp=Integer.MAX_VALUE;
    for(int i=0;i<k;i++)
    {
        ceilAndFloor(node,temp);
        temp=floor;
        floor=Integer.MIN_VALUE;
    }
    
    return temp;
    }