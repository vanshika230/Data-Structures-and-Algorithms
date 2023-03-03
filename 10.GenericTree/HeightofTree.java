public static int HeightbyNodes(Node root){
  int height=0;
  for(Node child: root.children){
    int ch= HeightbyNodes(child);
    height= Math.max(ch,height):
  }
  return height+1;
}
