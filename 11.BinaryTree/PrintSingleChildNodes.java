public static void printSingleChildNodes(Node node, Node parent){
      if(node == null) return;
      
      if(parent != null && parent.left == null){
          System.out.println(node.data);
      }
      
      if(parent != null && parent.right == null){
          System.out.println(node.data);
      }
      
      printSingleChildNodes(node.left, node);
      printSingleChildNodes(node.right, node);
  }
