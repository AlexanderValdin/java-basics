
public class StringManipulator {
	public String trimAndConcat(String str1, String str2) {
        String newString = str1.trim() + str2.trim();
        return newString;
    }
    public Integer getIndexOrNull(String str3, char ch1) {
        Integer resultado = str3.indexOf(ch1);
        return resultado;
    }
    public Integer getIndexOrNull(String str4, String str5) {
        Integer resultado = str4.indexOf(str5);
        return resultado;
    }
    public String concatSubstring(String str1, int int1, int int2, String str2) {
        String str3 = str1.substring(int1, int2);
        String finalString = str3 + str2;
        return finalString;
    }

}
