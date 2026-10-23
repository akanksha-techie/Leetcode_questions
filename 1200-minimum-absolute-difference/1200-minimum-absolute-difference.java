class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = arr[1] - arr[0];
        for(int i = 1; i < arr.length; i++){
            int x = arr[i] - arr[i - 1];
            min = Math.min(x, min);
        }
        List<List<Integer>> a = new ArrayList<>();
        for(int i = 1; i < arr.length; i++){
            int x = arr[i] - arr[i - 1];
            if(x == min){
                List<Integer> z = new ArrayList<>();
                z.add(arr[i - 1]);
                z.add(arr[i]);
                a.add(z);
            }
        }
        return a;
    }
}