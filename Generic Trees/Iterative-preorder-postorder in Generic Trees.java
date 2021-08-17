  static class Pair    //Stores the pair value in stack, i.e. of node and state
  {
      Node node;
      int state;
      Pair(Node node,int state)
      {
          this.node=node;
          this.state=state;
      }
  }
  
  public static void IterativePreandPostOrder(Node node) 
{
    String pre=" ";
    String post= " ";
    Stack<Pair> temp=new Stack<>();
    temp.push(new Pair(node,-1));
    while(temp.size()>0)
    {
        Pair newp=temp.peek();
        if(newp.state==-1)
        {
            pre+=newp.node.data+" ";
            newp.state++;
        }
        else if(newp.state==newp.node.children.size())
        {
            post+=newp.node.data+" ";
            temp.pop();
        }
        else
        {
            Pair cp=new Pair(newp.node.children.get(newp.state),-1);
            temp.push(cp);
            newp.state++;
        }
    }
    System.out.println(pre);
    System.out.print(post);
}