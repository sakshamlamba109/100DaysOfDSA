public static int height(Node node)
{

  int h=-1;

 for(Node child:node.children)
{

  int tcom=height(child);
  
  h=Math.max(h,tcom);

}

 h=h+1;

 return h;

}


