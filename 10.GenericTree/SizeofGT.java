public static int size(Node root){
  if(root ==null){
    return 0;
  }
  int ct=1;
  for(Node child:root.children){
    ct+=size(child);
  }
  return ct;
}
