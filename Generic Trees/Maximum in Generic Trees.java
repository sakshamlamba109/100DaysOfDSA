public static int max(Node node)
{
    int max= Integer.MIN_Value;
    
    for(Node child:node.children)

    {
      int com=max(child);

      max=Math.max(max,com);

    }
  
    max=Math.max(max,node.data);
  
    return max;
}


