public static int max(Node root){
  int maximum= Integer.MIN_VALUE;
  for(Node node: root.children){
    int cm= max(child);
    maximum=Math.max(maximum,cm);
  }
  return Math.max(maximum,root.data);
}
