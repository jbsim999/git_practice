package coplit;

public class Q1 {
    public static Object sumTo;

    public int sumTo(int num){
        if(num == 0) return 0;
        
        int head = num;
        int tail = num-1;
        return  head + sumTo(tail);
    }
}
