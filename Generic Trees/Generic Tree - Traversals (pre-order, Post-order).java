public static void traversal(Node node)
{
   System.out.println("Node Pre"+node.data);

   for(Node child:node.children)

   {
      
      System.out.println("Edge Pre"+node.data+ "--"+child.data);

      traversal(child);

      System.out.println("Edge Post"+node.data+ "--"+child.data);
      
    }

    System.out.println("Node Post"+node.data);

    return;

}
<<<<<<< HEAD

=======
>>>>>>> ab64840c3b3b44f01f437e3c942ee97fa5e39281
