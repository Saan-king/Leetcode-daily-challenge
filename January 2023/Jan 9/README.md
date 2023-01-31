In a preorder traversal, we need to visit the root node first, then all left child nodes, followed by the right child nodes.
  
  root -> left -> right
  
Algorithm
Initialize an empty array answer.
Start with the root node root. If root is not NULL:
add its value to answer.
repeat step 2 with root's left child
repeat step 2 with root's right child.
Return answer after the iteration stops.
