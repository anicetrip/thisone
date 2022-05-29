import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.border.Border;
import javax.swing.text.StyledEditorKit.ForegroundAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class LC36 {
    public static void main(String[] args) {
        char[][] a = {{'.','.','.','.','.','.','5','.','.'},
                      {'.','.','.','.','.','.','.','.','.'},
                      {'.','.','.','.','.','.','.','.','.'},
                      {'9','3','.','.','2','.','4','.','.'},
                      {'.','.','7','.','.','.','3','.','.'},
                      {'.','.','.','.','.','.','.','.','.'},
                      {'.','.','.','3','4','.','.','.','.'},
                      {'.','.','.','.','.','3','.','.','.'},
                      {'.','.','.','.','.','5','2','.','.'}};
        new LC36().isValidSudoku(a);
    }

    public boolean isValidSudoku(char[][] board) {
        List<Map<Character,Integer>> rows = new ArrayList<>();
        List<Map<Character,Integer>> cols = new ArrayList<>();
        List<Map<Character,Integer>> subs = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            Map<Character,Integer> row = new HashMap<>();
            Map<Character,Integer> col = new HashMap<>();
            Map<Character,Integer> sub = new HashMap<>();

            rows.add(row);
            cols.add(col);
            subs.add(sub);

        }



        for(int i = 0;i < 9;i++){
            for(int j = 0; j < 9; j ++){
                if(board[i][j] != '.'){
                    if(rows.get(i).containsKey(board[i][j]) || cols.get(j).containsKey(board[i][j]) || subs.get(i /3 * 3 + j / 3).containsKey(board[i][j])){

                        System.out.println(rows.get(i).containsKey(board[i][j]) + " " + cols.get(j).containsKey(board[i][j]) + " " + subs.get(i /3 + j / 3).containsKey(board[i][j]) );


                        System.out.println(i + " " + j);
                        return false;
                    }else{
                        rows.get(i).put(board[i][j], 1);
                        cols.get(j).put(board[i][j], 1);
                        subs.get(i /3 * 3 + j / 3).put(board[i][j], 1);
                    }
                }
            }
        }




        return true;
    }

    
}
