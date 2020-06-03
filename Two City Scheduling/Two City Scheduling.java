class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a,b)->Integer.compare(a[0]-a[1],b[0]-b[1]));
        int Totalcost=0;
        for(int i=0;i<costs.length;i++)
        {
            Totalcost+=costs[i][i<costs.length/2?0:1];
        }
        return Totalcost;
        
    }
}