package coplit;

public class codeTest {
    public static int[] solution;

    public int[] solution(int[] numList){
        numList = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] answer = new int[numList.length];
        for(int i = 0; i < numList.length ; i++){
            answer[i] = numList[numList.length - i];
        }
        return answer;

    }
}
