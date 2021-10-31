package org.codestreak.matrix;

public class SpiralMatrixPrint {

    public static int[] spiralMatrix(int[][] arr, int row, int col){
        /*New size of array will be row*col*/
        int[] newArray = new int[row*col];
        int k=0;
        for(int i=0;i<row;i++){
            boolean l2r = i%2==0;
            if(l2r){
                for(int j=0;j<col;j++){
                    newArray[k++] = arr[i][j];
                }
            }else{
                for(int j=col-1;j>=0;j--){
                    newArray[k++] = arr[i][j];
                }
            }
        }
        return newArray;
    }
}
