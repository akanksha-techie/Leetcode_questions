class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[] freq = new int[n + 1];
        for(int[] item : items){
            freq[item[0]]++;
        }
        int[] gain = new int[n + 1];
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j += i){
                gain[i] += freq[j];
            }
            gain[i]--;
        }
        int minPrice = Integer.MAX_VALUE;
        for(int[] item : items){
            minPrice = Math.min(minPrice, item[1]);
        }
        Arrays.sort(items, (a, b) -> Integer.compare(a[1], b[1])
        );
        long answer = 0;
        long remaining = budget;
        for(int[] item : items){
            int factor = item[0];
            int price = item[1];
            if(price >= 2L * minPrice) {
                break;
            }
            if(gain[factor] == 0) {
                continue;
            }
            long count = Math.min(
                gain[factor],
                remaining / price
            );
            answer += 2 * count;
            remaining -= count * price;
        }
        answer += remaining / minPrice;
        return (int) answer;
    }
}