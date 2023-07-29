public class minstack {
    
//  Your MinStack object will be instantiated and called as such:
//  MinStack obj = new MinStack();
//    obj.push(val);
//   obj.pop();
//   int param_3 = obj.top();
//   int param_4 = obj.getMin();
 
    
}
//APPROACH-1;
//ye min stack hai esme hame min nikalna hai to esme do approach hai so we can do we can create 2 stacks and puch element one on both the stack maan ke chalo hame min nikalna hai to ham ek or stack banaenge or jo hmara dusra stack hoga usko kuch es trah fill karenge suppose 1 push kia to ab 2 aaega to dekhenge 1 ko compare karenge 2 se 1 chota hai 2 se to ham dubara 1 ko push kardenge or agar  1 se bhi koi chota aagya to ham phir usi value ko push kardenge ye hamari 1st approach jo o(n) use kr raa h...

//APPROACH 2
//most important approach h ye esme hamko kya karna h dekh simple hai without extra space use karenge hamko value push karni h .
//push->
//push ke case me agar hamara stack khali h to ham simple push kardenge or hamne ek minimum banaya hoga .. variable or jo push kia hai usko min se updatte kardenge ab hmne dekha ki next value daali jo us number se bhi choti aagae to ab ham kya karenge //MOST IMPORTANT POINT// ham esme direct push nhi krenge ham esme apna jo min h usko val-min karke daalenge(but it fail for negative number ek farzi number maanenge or pushkaregede lekin  negative ke case me nhi hoga to ham 2*val-min) daalenge or min ko update kardenge jo hmara naya min aaya hai...ye hai hmara push case

//ab pop me  kya karenge ham check karenge jo hamari value hai .. mtlb hamne dekh st.peek()>min mtlb st.peek()par bada element hai to ham simple return st.pop kardenge .. but ab naya case jab hmara value peek ki min se bhi choti aagae toh ham kya krenge 
//ek variable banaya old karke usme int old=2*min-st.peek() or apne min ko update kardenge  return kardenge 
//or min ko bhi update kardenge nae min se or st.pop() kardemhe phir.

//or peek ke case me ham simple ye karenge jab hmara st.peek()>min se bda hai to simple st.peek return kardenge . 
//or agar st.peek()<min mtlb min chota hai eska mtlb min se bhi koi chota h to mtlb koi fari value hia to ham return min kardenge;

//most impt ye code hme long me karna padega kunki integer ke case me fail hojaaega...by using type cast we have to do it.