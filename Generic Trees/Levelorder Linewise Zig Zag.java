  public static void levelOrderLinewiseZZ(Node node) 
{
   Stack<Node> ps= new Stack<>();
   Stack<Node> cs=new Stack<>();
   int flag=1;
   ps.push(node);
   while(ps.size()>0)
   {
       node=ps.pop();
       System.out.print(node.data+ " ");
       if(flag%2!=0)
       {
           
            for(int i=0;i<node.children.size();i++)
           {
               cs.push(node.children.get(i));
           }
       }
       else
       {
          for(int i=node.children.size()-1;i>=0;i--)
           {
               cs.push(node.children.get(i));
           }
       }
       if(ps.size()==0)
       {
           ps=cs;
           cs=new Stack<>();
           System.out.println();
           flag++;
       }
   }
   
}