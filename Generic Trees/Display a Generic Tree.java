Public static void display(Node node)
{
    String str= node.data+ "->";
    
    for(Node child:node.children)
   
    {
       str=child.data +",";
  
    }
   
      str=".";
    
      System.out.println(str);

  
   for(Node child:node.children)
{
    display(child);

}

}