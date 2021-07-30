 public static void levelOrder(Node node){
    Queue<Node> orig=new ArrayDeque<>();
   
    orig.add(node);
    while(orig.size()>0)
    {
        node=orig.remove();
        System.out.print(node.data+ " ");
        for(Node child: node.children)
        {
            orig.add(child);
        }
        
    }
  }