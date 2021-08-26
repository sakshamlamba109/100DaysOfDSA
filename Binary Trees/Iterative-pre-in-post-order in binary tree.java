public static void iterativePrePostInTraversal(Node node) 
  {   String pre=" ";
      String inor=" ";
      String post=" ";
      
      
      Stack<Pair> st=new Stack<>();
      Pair np=new Pair(node,1);
      st.push(np);
      
      while(st.size()>0)
      {
          Pair top=st.peek();
          if(top.state==1)
          {
              pre+=top.node.data+" ";
              top.state++;
              if(top.node.left!=null)
              {
                  Pair ln=new Pair(top.node.left,1);
                  st.push(ln);
              }
             
          }
          else if(top.state==2)
          {
              inor+=top.node.data+" ";
              top.state++;
              if(top.node.right!=null)
              {
                  Pair rn=new Pair(top.node.right,1);
                  st.push(rn);
              }
          }
          else
          {
              post+=top.node.data+" ";
              st.pop();
          }

          
      }
         System.out.println(pre);
         System.out.println(inor);
         System.out.println(post);
      
    
  }