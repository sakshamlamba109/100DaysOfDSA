Public static int size(Node node)
{
  int s=0;

  for(Node child: node.children)

  { 

    int ch=size(child);
   
    s=s+ch;

  }

  s=s+1;
  
 return s;

}