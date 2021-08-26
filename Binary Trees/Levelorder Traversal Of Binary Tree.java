public static void levelOrder(Node node) 
{
    Queue<Node> og=new ArrayDeque<Node>();
    Queue<Node> child=new ArrayDeque<Node>();
    og.add(node);
    while(og.size()>0)
    {
        Node temp=og.remove();
        System.out.print(temp.data+ " ");
        if(temp.left!=null)
        {
            child.add(temp.left);
        }
        if(temp.right!=null)
        {
            child.add(temp.right);
        }
        if(og.size()==0)
        {
            og=child;
            child= new ArrayDeque<Node>();
            System.out.println();
        }
    }
    
 }
