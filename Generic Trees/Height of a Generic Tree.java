public static int height(Node node)
{

  int h=-1;  //here h=-1 to cover the case when the tree has a single node

 for(Node child:node.children)
{

  int tcom=height(child);
  
  h=Math.max(h,tcom);

}

 h=h+1;

 return h;

}
<<<<<<< HEAD


=======
>>>>>>> 59618a1c9da4c212f2845a09effbfd3454019475
