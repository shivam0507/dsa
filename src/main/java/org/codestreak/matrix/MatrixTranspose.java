package org.codestreak.matrix;

public class MatrixTranspose {

    public static int[][] transpose(int[][] arr, int n){
        if(arr.length != arr[0].length){
            throw new RuntimeException("Invalid Input! Square matrix is allowed");
        }
        int[][] matrix = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=arr[j][i];
            }
        }
        return matrix;
    }

    public static int[][] transposeInplace(int[][] arr, int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        return arr;
    }
}
