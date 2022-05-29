public class LC566 {

    public static void main(String[] args) {
//         [[1,2],[3,4]]
// 1
// 4


        int [][] a = {{1,2},{3,4}};
        new LC566().matrixReshape(a, 4, 1);

    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {

        if(mat.length * mat[0].length != r * c){
            return mat;
        }
        int[][] a = new int[r][c];
        int j = 0;
        int k = 0;
        for (int[] line : mat) {
            for (int point : line) {
                a[k][j] = point;
                if(j < c - 1){
                    j ++;
                }else{
                    j = 0;
                    k ++;
                }
            }
        }
        return a;
    }
}
