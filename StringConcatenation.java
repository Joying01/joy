public class StringConcatenation {
    public static String concatenatedStrings(String str1, String str2, String str3, String str4) {
        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();
        int len4 = str4.length();

        char[] str5 = new char[len1 + len2 + len3 + len4];

        int i = 0;
        while (i < len1) {
            str5[i] = str1.charAt(i);
            i++;
        }
        int j = 0;
        while (j < len2) {
            str5[i] = str2.charAt(j);
            i++;
            j++;
        }

        int k = 0;
        while (k < len3) {
            str5[i] = str3.charAt(k);
            i++;
            k++;
        }
        int l = 0;
        while (l < len4) {
            str5[i] = str4.charAt(l);
            i++;
            l++;
        }
        return new String(str5);
    }

    public static void main(String[] args) {
        String str1 = "EDIROSE ";
        String str2 = "JOY ";
        String str3 = "MABANGUE ";
        String str4 = "VELASCO ";

        String concatenatedString = concatenatedStrings(str1, str2, str3, str4);
        System.out.println("Concatenated String: " + concatenatedString);
    }
}