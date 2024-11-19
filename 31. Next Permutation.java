class Solution {
    void nextPermutation(int[] arr) {
        int n = arr.length;
        int index = -1;
        for ( int i = n-2; i >= 0; i--){
            if( arr[i] < arr[i+1]){
                index = i;
                break;
            }
        }
        
        if ( index == -1){

        for (int i = 0; i < n / 2; i++) {
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        }
    }
        else{
        int ChangeIndex = -1;
        for ( int i = n-1; i >= 0; i--){
            if ( arr[i] > arr[index]){
                ChangeIndex = i;
                break;
            }
        }

        int temp = arr[index];
        arr[index] = arr[ChangeIndex];
        arr[ChangeIndex] = temp;
        
        for ( int i = index + 1; i < n-1; i++){
            int p = 0;
            boolean flag = false;
            for ( int j = i+1; j < n; j++){
                if ( arr[i] > arr[j]){
                    flag = true;
                    p = j;
                }
            }
            if(flag){
                    int o = arr[i];
                    arr[i] = arr[p];
                    arr[p] = o;
            }
        }
        }
        
    }
}
