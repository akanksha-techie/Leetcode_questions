class Solution {
    public void duplicateZeros(int[] arr) {
        int[] ans = new int[arr.length];
        int i = 0;
        int j = 0;
        while(i < arr.length && j < arr.length){
            if(arr[i] == 0){
                ans[j] = 0;
                j++;
                if(j < arr.length) ans[j] = 0;
                j++;
            }else{
                ans[j] = arr[i];
                j++;
            }
            i++;
        }
        for(int k = 0; k < ans.length; k++){
            arr[k] = ans[k];
        }
    }
}