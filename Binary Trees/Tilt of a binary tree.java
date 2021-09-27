 static int tilt = 0;
  public static int tilt(Node node){
      if(node==null)
      {
          return 0;
      }
      //will return left's sum and change tilt for left side
   int ls=tilt(node.left);
   //will return right's sum and change tilt for right side
   int rs=tilt(node.right);
   int ltilt=Math.abs(ls-rs);
   tilt+=ltilt;
   int ts=ls+rs+node.data;
   return ts;
  }