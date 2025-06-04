package ConsultAdd_private_Ltd;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * You are given a string S of N lowercase letters. Find the minimum number elements that must be deleted to obtain
 * a word in which letter occurs a unique number of times, We only care about occurence of letter that appears at
 * least once in a result.
 *
 * input: aaabbb
 * output: 1
 *
 * input: ccaaffddceee
 * output: 4
 */

public class Question_1 {

    public static int minDeletions(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        Set<Integer> usedFeq = new HashSet<>();
        int count = 0;

        for (int f : freq.values()) {
            while (f > 0 && usedFeq.contains(f)) {
                f--;
                count++;
            }
            if (f > 0) {
                usedFeq.add(f);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minDeletions("ccaaffddceee"));
    }
}