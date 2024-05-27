public class pr {
    public static void main(String[] args) {
        String str1 = "rest";
        String str2 = "test";
        String str3 = "nest";
        StringBuilder cs = sub(str1, str2, str3);
        System.out.println(cs.toString());
    }
    static StringBuilder sub(String str1, String str2, String str3){
        StringBuilder cs = new StringBuilder();
        for (int i = 0; i < str1.length() -2; i++) {
            for (int j = i+3; j <= str1.length(); j++) {
                String subs = str1.substring(i, j);
                if (str2.contains(subs) && str3.contains(subs)){
                    cs.append(subs);
                }
            }
        }
        return cs;
    }
}
    

