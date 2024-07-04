
public class Q23 {

    public static void conquer(int arr[], int l, int mid, int r){
          int merged[] = new int[r - l + 1];

          int i1 = l;
          int i2 = mid+1;
          int x = 0;

          while (i1 <= mid && i2 <= r) {
             if(arr[i1] <= arr[i2]){
                merged[x++] = arr[i1++];
             }else{
                merged[x++] = arr[i2++];
             }
          }

          while (i1 <= mid) {
            merged[x++] = arr[i1++];
          }

          while(i2 <= r){
            merged[x++] = arr[i2++];
          }

          for(int i=0, j=l; i<merged.length; i++, j++){
            arr[j] = merged[i];
          }
    }

     public static void divide(int arr[], int l, int r){
        if(l >= r){
            return;
        }

        int mid = l + (r-l)/2;
        divide(arr, l, mid);
        divide(arr, mid+1, r);
        conquer(arr, l, mid, r);
     }  
    public static void main(String args[]){
        int arr[] = { 6, 3, 9, 5, 2, 8};
        int n = arr.length;

        divide(arr, 0, n-1);
        //print
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}

// Output
// 2 3 5 6 8 9 
