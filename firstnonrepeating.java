import java.util.LinkedList;
import java.util.Queue;

public class firstnonrepeating {
    public static void main(String[] args) {
        String value="zz";
     String ans=(FirstNonRepeating("aabcaaavvbbb"));
     System.out.println(ans);
        
    }
     public static String FirstNonRepeating(String A)
    {
       char [] arr=new char[128];   //dekh es ques me hame a a b c given h esme hame first first non repeating character nikalana hai .. or agar koi ek hi 2 baar agay to hamen '# ' use karlena h to hmne ek char arr banae or fre me store kar lia ab 
        Queue<Character> queue = new LinkedList<>();
        String ans="";
       for(int i =0;i<A.length();i++){
           char ch=A.charAt(i);
           arr[ch]++; // frequncy m store karlia..
           queue.add(ch); //or us character ko hamne queue me bhi daaldia   //a a b c   -- a -1,, a -2 
           
           
           while(!queue.isEmpty()){
               if(arr[queue.peek()]>1){  // ab maan le a dubara aagya to ham us char ko nikal ke fre check karenge agar 1 se jyada h to pop karenge phir dubara chalega ye loop jab tak queue empty naa ho varna koi aesa character mil jaae  jiski frequency 1 hai to ham break karenge or queue ke jo peek par hoga vo addkaredenge  simply.. or agar hamari queue empty hojaati hai eska mtlb koi bhi nhi h to ham # add kardenge... 
                   queue.poll();
               }
               else{
                   ans=ans+queue.peek();
                   break;
               }
           }
           if(queue.isEmpty()){
               ans=ans+'#';
           }
           
       }
       return ans;
    }
    
}
