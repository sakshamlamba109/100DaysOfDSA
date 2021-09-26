static class DiaPair{
     int ht;
     int dia;
 }
 public static DiaPair diameter2(Node node)
 {
     DiaPair lp=diameter(node.left);
     DiaPair rp=diameter(node.right);
     DiaPair mp=new Diapair();
     mp.ht=lp+rp+1;
     fes=lp+rp+2;
     mp.dia=Math.max(fes,Math.max(lp.dia,rp.dia));
     return mp;
 }