package leetcode_strivers_dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateFromStart {
	
//	private static char[] removeDuplicates(char[] input) {
//		if(input==null) {
//			return null;
//		}
//		Map<Character, Integer> hmt = new HashMap<>();
//		for(int i=input.length-1;i>=0;i--) {
//			if(hmt.containsKey(input[i])) {
//				hmt.put(input[i], hmt.get(input[i])+1);
//			}else {
//				hmt.put(input[i], 1);
//			}
//		}
//		List<Character> result = new ArrayList<>();
//		
//		for(Map.Entry<Character,Integer> entry: hmt.entrySet()) {
//			result.add(entry.getKey());
//		}
//		
//		char [] ch =new char[result.size()];
//		int num=0;
//		for(char c: result)
//		{
//			ch[num]=c;
//			num++;
//		}
//		return ch;
//		
//	}
//	   public static char[] removeDuplicates(char[] arg) {
//	        if (arg == null) {
//	            return null;
//	        }
//
//	        ArrayList<Character> result = new ArrayList<>();
//	        Set<Character> seen = new HashSet<>();
//
//	        // Iterate from the end to the beginning
//	        for (int i = arg.length - 1; i >= 0; i--) {
//	            char element = arg[i];
//	            // If this is the first time we've seen this element, add it to the result list
//	            if (!seen.contains(element)) {
//	                result.add(0, element); // Add to the beginning of the result list
//	                seen.add(element);
//	            }
//	        }
//
//	        // Convert ArrayList to char[]
//	        char[] resultArray = new char[result.size()];
//	        for (int i = 0; i < result.size(); i++) {
//	            resultArray[i] = result.get(i);
//	        }
//
//	        return resultArray;
//	    }
	   public static char[] removeDuplicates(char[] arg) {
		    if (arg == null) {
		        return null;
		    }
		    List<Character> ch = new ArrayList<>();
		    Set<Character> hst = new HashSet<>();
		    
		    for(int i=arg.length-1;i>=0;i--) {
		    	if(!hst.contains(arg[i])) {
		    		hst.add(arg[i]);
		    		ch.add(0,arg[i]);
		    	}
		    }
		    
		    char[] result  = new char[ch.size()];
		    for(int i=0;i<result.length;i++) {
		    	result[i]=ch.get(i);
		    }
		    return result;
		    
	   }
public static void main(String[] args) {
	  char[] input = {'a', 'b', 'a', 'b', 'c', 'd', 'd', 'e', 'a', 'd'};
      char[] result = RemoveDuplicateFromStart.removeDuplicates(input);
      System.out.println(result); // Output: [b, c, e, a, d]
}


}
