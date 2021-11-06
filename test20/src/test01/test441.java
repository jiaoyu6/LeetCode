package test01;

public class test441 {
    public static int arrangeCoins(int n) {
        int count=1;
        while (n>0){
            n-=count++;
        }
        return count-2;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
}
