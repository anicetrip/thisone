public class LC59 {

    public static void main(String[] args) {
        new LC59().generateMatrix(3);
    }

    public int[][] generateMatrix(int n) {
        int [][] map = new int[n][n];
        int pointer = 1;
        int x = 0;
        int y = 0;
        while(true){
            for(;y < n; y ++){
                if(map[x][y] == 0){
                    map[x][y] = pointer;
                    pointer ++;
                }else{
                    break;
                }
            }
            y --;
            x ++;
            for(;x < n; x ++){
                if(map[x][y] == 0){
                    map[x][y] = pointer;
                    pointer ++;
                }else{
                    break;
                }
            }
            x --;
            y --;
            for(;y >= 0; y --){
                if(map[x][y] == 0){
                    map[x][y] = pointer;
                    pointer ++;
                }else{
                    break;
                }
            }
            y ++;
            x --;
            for(;x >= 0; x --){
                if(map[x][y] == 0){
                    map[x][y] = pointer;
                    pointer ++;
                }else{
                    break;
                }
            }
            x ++;
            y ++;
            if(pointer > n * n){
                break;
            }
        }
        return map;
    }
}
