We have NNN strings, each of the same length, say KKK, in a list strs.
  If we make a grid or matrix using these strings with one on each line,
we want to find the number of columns in the matrix that are not in lexicographic order.
  
Algorithm
Iterate over the columns from 0 to K - 1, for each column col:

Iterate over the rows row from 1 to N - 1:

If the character at index col in the string strs[row] is smaller than the character at index col in the string strs[row - 1], then increment the counter variable answer. Also, we can break the inner loop here as we find the current column unsorted.
Otherwise, we check the next row.
Return answer.
