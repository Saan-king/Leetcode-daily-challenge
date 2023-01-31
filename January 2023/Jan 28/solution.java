public class SummaryRanges {
    TreeMap<Integer, Integer> map;

    public SummaryRanges() {
       map=new TreeMap<>();
    }
    
    public void addNum(int val) {
    if(map.containsKey(val)) return;
    Integer lowerKey = map.lowerKey(val); //lower interval start
    Integer higherKey = map.higherKey(val); // higher interval start
    //merge three intervals like [[1,1],[3,3]] and [2,2] for val =2, so [1,3]
    // for lower we need to check end, for higher we need to check start
    if(lowerKey != null && higherKey !=null && val == map.get(lowerKey)+1 && val == higherKey -1 ){
        map.put(lowerKey, map.get(higherKey));
        map.remove(higherKey);
    }
    //merge lower and this interval, we can only merge [1,1] and[2,2], not [1,1] and [3,3], end of lower should be greater than start of next to merge
    else if (lowerKey != null && val <= map.get(lowerKey) +1 ){
        map.put(lowerKey, Math.max(val,map.get(lowerKey)));
    }
    //merge higher and this interval[1,3],[7,7] and [6,6], merge higher , so [1,3],[6,7]
    else if (higherKey != null && val == higherKey -1 ){
        map.put(val,map.get(higherKey));
        map.remove(higherKey);
    } 
    //insert this interval,[1,1],[3,3] for val 3
    else {
        map.put(val,val);
    }
}
public int[][] getIntervals() {
List<int[]> res = new ArrayList<>();
for(int a:map.keySet()){
res.add(new int[]{a,map.get(a)});
}
return res.toArray(new int[map.size()][2]);
}

}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(value);
 * int[][] param_2 = obj.getIntervals();
 */
