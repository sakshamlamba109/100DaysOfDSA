  public static int lca(Node node, int d1, int d2)
  {
        ArrayList<Integer> temp1=nodeToRootPath(node,d1);  //return an ArrayList containing the whole path of the node d1 starting from the root 
        ArrayList<Integer> temp2=nodeToRootPath(node,d2);  //return an ArrayList containing the whole path of the node d2 starting from the root
                                                           //nodeToRootPath(Node node, int data) function already uploaded previously
        int i=temp1.size()-1;
        int j=temp2.size()-1;
        
        while(i>=0 && j>=0 && temp1.get(i)==temp2.get(j))
        {
            i--;
            j--;
        }
        return (temp1.get(i+1));
  }