package dp;

public class dp_coin_select {
    public static void main(String[] args) {
        // int a = getCoin(22, 0);
        int a = getCoin1(11);
        System.out.println(a);
    }



    // public static int getCoin(int moneyLeft,int counts){
    //     if(moneyLeft < 0){
    //         return Integer.MAX_VALUE;
    //     }else if(moneyLeft == 0){
    //         return counts;
    //     }
    //     int min1 = Integer.min(getCoin(moneyLeft - 5, counts + 1),getCoin(moneyLeft - 11, counts + 1));
    //     int min2 = Integer.min(min1, getCoin(moneyLeft - 1, counts + 1));
    //     return min2;
        
    // }




    public static int getCoin1(int moneyLeft){
        if(moneyLeft < 0){
            return Integer.MAX_VALUE;
        }else if(moneyLeft == 0){
            return 0;
        }
        int min1 = Integer.min(getCoin1(moneyLeft - 5),getCoin1(moneyLeft - 11));
        int min2 = Integer.min(min1, getCoin1(moneyLeft - 1));
        return min2 + 1;
        
    }
}
