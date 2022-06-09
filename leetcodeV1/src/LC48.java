
public class LC48 {
    public void rotate(int[][] matrix) {
        int tmpSave = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0;j < matrix.length;j++){
                tmpSave = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmpSave;
            }
        }

        for(int i = 0;i < matrix.length; i++){
            for(int j = 0 ; j < matrix.length;j ++){
                tmpSave = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length -1 - j];
            }
        }
    }
}
