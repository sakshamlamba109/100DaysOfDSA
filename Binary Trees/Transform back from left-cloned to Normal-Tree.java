 public static Node transBackFromLeftClonedTree(Node node)
{ 
    if(node==null)
{
    return null;
}

Node lc=transBackFromLeftClonedTree(node.left.left);
Node rc=transBackFromLeftClonedTree(node.right);

node.right=rc;
node.left=lc;

return node;

}
