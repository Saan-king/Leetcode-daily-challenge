If the frequence freq of a level is 1, then it is not possible to complete all the tasks.

Otherwise, we need to decompose freq = 3 tasks + 3 tasks + .... + 2 tasks,
with the minimum number of 3 and 2.

To summarize, needs (freq + 2) / 3 batch,
return the sum of (freq + 2) / 3 if possible.
