package org.codestreak.matrix;

public class BoundaryTraversal {

    public static int[] boundaryTraversal(int[][] arr, int row, int col){

        if(row==1){
            int[] boundary = new int[col];
            for(int i=0;i<col;i++){
                boundary[i]=arr[0][i];
            }
            return boundary;
        }else if(col==1){
            int[] boundary = new int[row];
            for(int i=0;i<row;i++){
                boundary[i]=arr[i][0];
            }
            return boundary;
        }else{
            int size = 2*(row+col-2);
            int[] boundary = new int[size];
            int k=0;
            /*traversing top row of matrix from left to right*/
            for(int i=0;i<col;i++){
                boundary[k++]=arr[0][i];
            }
            /*traversing rightmost column of matrix from top to bottom*/
            for(int i=1;i<row;i++){
                boundary[k++]=arr[i][col-1];
            }
            /*traversing bottom row of matrix from right to left*/
            for(int i=col-2;i>=0;i--){
                boundary[k++]=arr[row-1][i];
            }

            /*traversing left most column of matrix from bottom to top*/
            for(int i=row-2;i>0;i--){
                boundary[k++]=arr[i][0];
            }
            return boundary;
        }
    }
}
