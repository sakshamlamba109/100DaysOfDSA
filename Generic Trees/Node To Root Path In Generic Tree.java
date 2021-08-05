 public static ArrayList<Integer> nodeToRootPath(Node node, int data)
 {
    
    if(node.data==data)
    {   ArrayList<Integer> temp=new ArrayList<>();
        temp.add(node.data);
        return temp;
    }
    
    for(Node child:node.children)
    {
        ArrayList<Integer> path=nodeToRootPath(child,data);
        if(path.size()>0)
        {
            path.add(node.data);
            return path;
        }
    }
    return new ArrayList<>();
    
 }