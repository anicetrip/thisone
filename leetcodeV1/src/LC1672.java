/**
 * 1672. 最富有客户的资产总量
 *
 * @author 21001596_ZHENGTAO YIN
 * @date 2022/04/21 15:51
 **/
public class LC1672 {

    public static void main(String[] args) {
        int[][] arr = {{1,5},{7,3},{3,5}};
        int a = new LC1672().maximumWealth(arr);
        System.out.println(a);
    }

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if ( sum > max ){
                max = sum;
            }
        }
        return max;
    }

}
 