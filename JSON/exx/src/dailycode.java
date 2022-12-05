public class dailycode {
    public static void main(String[] args) {
        long num=64;

        long res = 1;
        while (res<num){
            res *= 2;
        }

        if(num==res) System.out.println(res);
        else System.out.println("false"+res);
    }
}
