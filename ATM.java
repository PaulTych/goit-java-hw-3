class ATM{
    public int countBanknotes(int sum){
        int[] bills = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int minCnt =0;
        int curCnt =0;
        int restSum = sum;
        int i=0;
        while (restSum>0) {
            curCnt = restSum/bills[i];
            restSum -= curCnt*bills[i];
            minCnt += curCnt;
            i++;
        }
        return minCnt;
    }
}