  static int diam = 0;
  public static int height(Node node)
  {
  int dn=-1;
  int sdn=-1;
  for(Node child:node.children)
  {
     int ch=height(child);
     if(ch>dn)
     {
         sdn=dn;
         dn=ch;
     }
     else if(ch>sdn)
     {
         sdn=ch;
     }
  }
  
  int cand=dn+sdn+2;
  if(cand>diam)
  {
      diam=cand;
  }
  dn+=1;
  return dn;

  }