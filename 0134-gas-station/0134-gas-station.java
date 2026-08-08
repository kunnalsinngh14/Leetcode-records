class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int totalcost=0;
        for(int i : gas){
            totalgas+=i;
        }
        for(int i : cost){
            totalcost+=i;
        }
        if(totalcost>totalgas){
            return -1;
        }
        int start = 0;
        for(int i = 0; i<gas.length; i++){
            int tank=0;
            if(gas[i]<cost[i]){
                continue;
            }
            int j = i;
            start = j;
            tank+=gas[j];
            j = (j + 1) % gas.length;
            while(j!=start){
                int prev = (j - 1 + gas.length) % gas.length;
                tank = tank - cost[prev] + gas[j];
                if(tank<cost[j]){
                    i=j;
                    break;
                }
                else{
                    j = (j + 1) % gas.length;
                }
            }
            if(j == start){
                return i;
            }
        }
        return -1;
    }
}