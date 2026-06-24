public class MatrixAdvanced {

    static int[][] transpose(int[][] matrix) {

        int[][] result =
                new int[matrix[0].length]
                        [matrix.length];

        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++)
                result[j][i]=matrix[i][j];

        return result;
    }

    static int determinant2x2(int[][] m) {

        return m[0][0]*m[1][1]
                - m[0][1]*m[1][0];
    }

    static int determinant3x3(int[][] m) {

        return m[0][0] *
                (m[1][1]*m[2][2]
                - m[1][2]*m[2][1])

                - m[0][1] *
                (m[1][0]*m[2][2]
                - m[1][2]*m[2][0])

                + m[0][2] *
                (m[1][0]*m[2][1]
                - m[1][1]*m[2][0]);
    }

    static double[][] inverse2x2(int[][] m) {

        int det = determinant2x2(m);

        double[][] inv = new double[2][2];

        inv[0][0] = m[1][1] / (double)det;
        inv[0][1] = -m[0][1] / (double)det;
        inv[1][0] = -m[1][0] / (double)det;
        inv[1][1] = m[0][0] / (double)det;

        return inv;
    }
}