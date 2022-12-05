import java.util.Map;

public class dailycode {
    public String letterCapitalize(String str){
        str = "";

        String res = "";

        res += String.valueOf(str.charAt(0));

        for (int i = 1; i<str.length()-1; i++){
            if(str.charAt(i) == ' ') res +=String.valueOf(str.charAt(i)).toUpperCase();
            res += String.valueOf(str.charAt(i));
        }
        System.out.println(res);
        return res;

    }

}
