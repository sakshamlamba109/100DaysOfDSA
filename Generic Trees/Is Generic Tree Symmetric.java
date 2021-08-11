 public static boolean areMirror(Node n1, Node n2)
{
      if(n1.children.size()!=n2.children.size())
      {
          return false;
      }
      for(int i=0, j=n1.children.size()-1; i<n1.children.size() && j>=0; i++, j--)
      {
          Node c1=n1.children.get(i);
          Node c2=n2.children.get(j);
          if(areMirror(c1,c2)==false)
          {
              return false;
          }
      }
      return true;
}

 public static boolean IsSymmetric(Node node) 
{
      boolean counter=areMirror(node,node);
      return counter;
}