public class LC240 {
    public static void main(String[] args) {
        int [][] a = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int b = 5;
        new LC240().searchMatrix(a, b);
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length ;
        int n = matrix[0].length ;
        int p1 = 0;
        int p2 = n - 1;

        while(p1 < m && p2 >= 0){
            if(target == matrix[p1][p2]){
                return true;
            }else if(target > matrix[p1][p2]){
                p1 ++;
            }else {
                p2 --;
            }
        }
        return false;
    }
}
// [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
// 5
// [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]]
// 20