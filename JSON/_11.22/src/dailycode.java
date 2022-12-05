public class dailycode {
    public static void main(String[] args) {
        class Solution{
            public String firstCharacter(String str) {
                // TODO:
                str = "hello world";
                if(str.length() == 0) return str;
                String res = String.valueOf(str.charAt(0));
                for(int i=0; i<str.length(); i++){
                    if(String.valueOf(str.charAt(i)) == " ") res += String.valueOf(str.charAt(i+1));
                }
                return res;
            }
        }
    }
}
