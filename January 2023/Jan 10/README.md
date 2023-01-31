## Approach 1: Recursion
### Intuition

The simplest strategy here is to use recursion. Check if p and q nodes are not None, and their values are equal. If all checks are OK, do the same for the child nodes recursively.

if (p == null && q == null) return true;
    // one of p and q is null
    if (q == null || p == null) return false;
    if (p.val != q.val) return false;
    return isSameTree(p.right, q.right) &&
            isSameTree(p.left, q.left);
            
  
#### Time complexity : 
O(N) where N is a number of nodes in the tree, since one visits each node exactly once.

#### Space complexity : 
O(N) in the worst case of completely unbalanced tree, to keep a recursion stack.
