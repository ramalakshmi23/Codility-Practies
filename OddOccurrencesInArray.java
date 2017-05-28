import java.util.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if(A == null){
            return 0;
        }
        Set<Integer> s = new HashSet<Integer>();
        for(int i : A){
            if(s.contains(i)){
                s.remove(i);
            }else{
                s.add(i);
            }
        }
        return (int)s.iterator().next();
    }
}
//https://codility.com/demo/results/trainingXZEE2H-8KD/