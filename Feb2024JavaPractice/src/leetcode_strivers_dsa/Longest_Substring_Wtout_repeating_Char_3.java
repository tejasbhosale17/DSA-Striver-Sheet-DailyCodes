package leetcode_strivers_dsa;

public class Longest_Substring_Wtout_repeating_Char_3 {
    public static void lengthOfLongestSubstring(String s) {
    	char ch [] =s.toCharArray();
    	int count=1;
    	int max=1;
    	for(int i=0;i<ch.length-1;i++) {
    		if(ch[i]==ch[i+1]) {
    			continue;
    		}else if(ch[i]!=ch[i+1]) {
    			count++;
    			max=Math.max(count, max);
    		}else {
    			max=1;
    		}
    	}
    	System.out.println("Maximum unique string length is:"+max);
    }
    
    
    
    
//  Previous logic  
//    public int lengthOfLongestSubstring(String s) {
//        int count=0;
//        String str="";
//        int[] numarr= new int[s.length()];
//        for(int i=0;i<s.length();i++)
//        {
//           str=str+s.charAt(i);
//           for(int j=1;j<s.length();j++){
//               for(int k=0;k<str.length();k++){
//                   if(str.charAt(k)!=s.charAt(j)){
//                       str=str+s.charAt(j);
//                   }else{
//                       numarr[i]=str.length();
//                       str="";
//                   }
//               }
//           }
//        }
//        // int max = Collections.max(Arrays.asList(numarr));
//        int max=numarr[0];
//        for(int i=1;i<numarr.length;i++)
//        {
//            // if(max<numarr[i]){
//            //     max=numarr[i];
//            // }
//            max=Math.max(numarr[i],max);
//        }
//        return max;
//    }
    
    public static void main(String[] args) {
		String s = "abcabcbb";
		lengthOfLongestSubstring(s);
	}
}
