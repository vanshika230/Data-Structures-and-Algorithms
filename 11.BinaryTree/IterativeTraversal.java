// Iterative Pre, In & Postorder Traversals

  public static void iterativePrePostInTraversal(Node root) {
    Stack<Pair> stk = new Stack<>();
    stk.push(new Pair(root, -1));
    
    ArrayList<Integer> preorder = new ArrayList<>();
    ArrayList<Integer> inorder = new ArrayList<>();
    ArrayList<Integer> postorder = new ArrayList<>();
    
    while(!stk.isEmpty()){
        Pair par = stk.peek();
        
        if(par.state == -1){
            // preorder
            preorder.add(par.node.data);
                
            if(par.node.left != null){
                stk.push(new Pair(par.node.left, -1));
            }
            par.state++;
            
        } else if(par.state == 0){
            // inorder
            inorder.add(par.node.data);
            
            if(par.node.right != null){
                stk.push(new Pair(par.node.right, -1));
            }
            par.state++;
            
        } else if(par.state == 1){
            // postorder
            postorder.add(par.node.data);
            stk.pop();
        }
    }
    
    for(Integer i: preorder) System.out.print(i + " ");
    System.out.println();
    for(Integer i: inorder) System.out.print(i + " ");
    System.out.println();
    for(Integer i: postorder) System.out.print(i + " ");
    System.out.println();
  }
