Suppose we shoot an arrow to [10,16] it also shoots [7,12] and if we shoot [2,8] the arrow also hits [1,6]. In simpler words, we can say if the first element of the current sub array is lesser than the targeted second element of any sub-array, the arrow hits both of them. If not, the arrow has to be shot again.

But the above theory will only work if the array is sorted for that we will get all the first elements of the array in increasing order hence, makes comparison easier without any loopholes.

After sorting the array looks like : [ [1,6] , [2,8] , [7,12] , [10,16] ]

The (a, b) -> Integer.compare(a[1], b[1]) is a lambda expression and in this case is an implementation of Comparator#compare(T,T). That method determines whether the first argument is less than, equal to, or greater than the second argument by returning a negative integer, zero, or a positive integer, respectively. 
