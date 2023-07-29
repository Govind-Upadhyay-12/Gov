import java.util.*;
public class Celebrity {
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
        celebrity(arr);

    }
    public static void celebrity(int [][] arr){
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            st.push(i);
            
        }

        while(st.size()>1){
            int a=st.pop();
            int b=st.pop();
            if(arr[a][b]==1){
                st.push(b);           //esme ham simple ye check karege jese maan le 0,1,2,3 st.pop=3,st.pop=2 kia to arr[2][3] me agar 1 ham mtlb 3 jo hai vo 2 ko jaanta hai to vo kabhi bhi 3 celebrity nhi ho skta to ham usko pop kardenge ..

            }
            else{
                st.push(a);     //varna else me aaenge or st.push(a) kardenge agar upar vaala nhi h to a 
            }

        }
        int cand=st.pop();
        for(int i=0;i<arr.length;i++){
            if(i==cand){   //or ye condition khud ko skip karne ke lie .... 
                continue;
            }
            if(arr[cand][i]!=0 || arr[i][cand]==0){   //phli conditon ka mtlb hai ki uski row me sab kuch zero hona chahye tabhi vo hoga or uske har colomn me 0 hona chahye 
             System.out.print("-1");
            }
            else{
                System.out.println(cand);
            }
        }
    }
  
    
}
