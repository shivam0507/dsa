package org.codestreak.matrix;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SpiralMatrixPrintTest {

    @Test
    public void givenMatrix_checkSprialOrNot() {
        int[][] input = {{1,2,3,},{4,5,6},{7,8,9}};
        int[] expected = {1,2,3,6,5,4,7,8,9};
        int[] actual = SpiralMatrixPrint.spiralMatrix(input, input.length, input[0].length);

        assertArrayEquals(expected, actual);
    }
}