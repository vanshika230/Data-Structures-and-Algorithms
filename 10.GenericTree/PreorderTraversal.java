class Solution {
      List<Integer> result = new ArrayList<>();
    
    public List<Integer> preorder(Node root) {
        if (root == null) return result;
        result.add(root.val);
        
        for (Node child : root.children) {
            preorder(child);
        }
        return result;  
    }
}
