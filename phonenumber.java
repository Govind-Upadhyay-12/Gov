public class phonenumber {
    static String[] key = { "", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };

    public static void main(String[] args) {

        String str = "789";
        keymaze(str, "");

    }

    public static void keymaze(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);  //7 nikla phle 
        String hey = key[ch - 48];        //convert that into integer..    //ye yaad rkhle substring ke lie ye aesa pattern use hoga .. ham phle character ko nikal ke  uski string leke .. aare h phir uske next ki substring calculate kar re h jise hamare saare ans aajaenge dekh simple approach dekh easy techinque ..
        //maan le mene 1 ka call lagaya jispe a b or 2 par  c hai to eska answet kya hoga ac  bc ye hoga to ye khi na khi a aara h to hme substring to pass karni h padegi
        for (int i = 0; i < hey.length(); i++) {
            keymaze(ques.substring(1), ans + hey.charAt(i));   //(89,ans+s)  //8
        }
    }

}
