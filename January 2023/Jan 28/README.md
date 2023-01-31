## 352. Data Stream as Disjoint Intervals

Given a data stream input of non-negative integers a1, a2, ..., an, summarize the numbers seen so far as a list of disjoint intervals.

Implement the SummaryRanges class:

SummaryRanges() Initializes the object with an empty stream.<br/>
void addNum(int value) Adds the integer value to the stream.<br/>
int[][] getIntervals() Returns a summary of the integers in the stream currently as a list of disjoint intervals [starti, endi]. The answer should be sorted by starti.
 

### Example 1:

Input
["SummaryRanges", "addNum", "getIntervals", "addNum", "getIntervals", "addNum", "getIntervals", "addNum", "getIntervals", "addNum", "getIntervals"]
[[], [1], [], [3], [], [7], [], [2], [], [6], []]<br/>
Output
[null, null, [[1, 1]], null, [[1, 1], [3, 3]], null, [[1, 1], [3, 3], [7, 7]], null, [[1, 3], [7, 7]], null, [[1, 3], [6, 7]]]<br/>

### Explanation
SummaryRanges summaryRanges = new SummaryRanges(); <br/>
summaryRanges.addNum(1);      // arr = [1] <br/>
summaryRanges.getIntervals(); // return [[1, 1]] <br/>
summaryRanges.addNum(3);      // arr = [1, 3] <br/>
summaryRanges.getIntervals(); // return [[1, 1], [3, 3]] <br/>
summaryRanges.addNum(7);      // arr = [1, 3, 7] <br/>
summaryRanges.getIntervals(); // return [[1, 1], [3, 3], [7, 7]] <br/>
summaryRanges.addNum(2);      // arr = [1, 2, 3, 7]<br/>
summaryRanges.getIntervals(); // return [[1, 3], [7, 7]]<br/>
summaryRanges.addNum(6);      // arr = [1, 2, 3, 6, 7]<br/>
summaryRanges.getIntervals(); // return [[1, 3], [6, 7]]
 

#### Constraints:

0 <= value <= 104<br/>
At most 3 * 104 calls will be made to addNum and getIntervals.
 

Follow up: What if there are lots of merges and the number of disjoint intervals is small compared to the size of the data stream?
