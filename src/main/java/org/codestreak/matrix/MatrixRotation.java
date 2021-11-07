package org.codestreak.matrix;

public class MatrixRotation {


    public static int[][] rotateBy90(int[][] arr, int n){

        /*transpose of matrix*/
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        /*reverse the columns*/
        for(int i=0;i<n;i++){
            int low=0, high=n-1;
            while (low<high){
                int temp = arr[low][i];
                arr[low][i] = arr[high][i];
                arr[high][i] = temp;
                low++;
                high--;
            }
        }
        return arr;
    }
}
