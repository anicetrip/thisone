package dp;

public class dp1 {


    public static void main(String[] args) {
        proecess1(3, 5, 6, 9);
    }




    public static int proecess1(int cur,int rest,int aim, int N){
        if(rest == 0){
            System.out.print(cur + " ");
            System.out.println(cur == aim);
            return cur == aim ? 1 : 0;
        }
        if(cur == 1){
            System.out.print(cur + " ");
            return proecess1(cur + 1, rest - 1, aim, N);
        }
        if(cur == N){
            System.out.print(cur + " ");
            return proecess1(cur - 1, rest - 1, aim, N);
        }
        System.out.print(cur + " ");
        return proecess1(cur - 1, rest - 1, aim, N) + proecess1(cur + 1, rest - 1, aim, N);
    }

}
