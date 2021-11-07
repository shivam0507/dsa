package org.codestreak.matrix;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MatrixTest {

    @Test
    public void givenMatrix_checkSprialOrNot() {
        int[][] input = {{1,2,3,},{4,5,6},{7,8,9}};
        int[] expected = {1,2,3,6,5,4,7,8,9};
        int[] actual = SpiralMatrixPrint.spiralMatrix(input, input.length, input[0].length);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void givenMatrix_checkBoundaryTraversal() {
        int[][] input = {{1,2,3,}};
        int[] expected = {1,2,3};
        int[] actual = BoundaryTraversal.boundaryTraversal(input, input.length, input[0].length);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void givenMatrix_checkTranspose() {
        int[][] input = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};
        int[][] expected = {{1,4,7},
                            {2,5,8},
                            {3,6,9}};
        int[][] actual = MatrixTranspose.transpose(input, input.length);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void givenMatrix_usingInplace_checkTranspose() {
        int[][] input = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        int[][] expected = {{1,4,7},
                {2,5,8},
                {3,6,9}};
        int[][] actual = MatrixTranspose.transposeInplace(input, input.length);

        assertArrayEquals(expected, actual);
    }
}