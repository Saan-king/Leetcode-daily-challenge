class Players {
  public int age;
  public int score;
  public Players(int age, int score) {
    this.age = age;
    this.score = score;
  }
};
class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        final int n=scores.length;
        Players[] p=new Players[n];
        int[] dp=new int[n];

        for(int i=0;i<n;i++)
            p[i]=new Players(ages[i],scores[i]);

        Arrays.sort(p,(a,b)-> a.age==b.age ? b.score-a.score:b.age-a.age);

        for(int i=0;i<n;i++){
            dp[i]=p[i].score;
            for(int j=0;j<i;j++){
                if(p[j].score >= p[i].score)
                    dp[i]=Math.max(dp[i],dp[j]+p[i].score);
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
