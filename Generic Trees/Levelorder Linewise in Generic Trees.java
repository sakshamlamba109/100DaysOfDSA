  public static void levelOrderLinewise(Node node){
    Queue<Node> temp=new ArrayDeque<>();
    Queue<Node> t=new ArrayDeque<>();
    temp.add(node);
    
    while(temp.size()>0)
    {
        node=temp.remove();
        System.out.print(node.data + " ");
       
    for(Node child:node.children)
    {
        
        t.add(child);
    }
    if(temp.size()==0)
    {
        temp=t;
        t=new ArrayDeque<>();
        System.out.println();
    }
  }
  
  }

