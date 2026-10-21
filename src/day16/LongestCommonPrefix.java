package day16;
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                
            }
        }

        return prefix;
    }
    

    public static void main(String[] args) {

        String[] strs1 = {"flowers", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs1));

        String[] strs2 = {"apple", "racecar", "race"};
        System.out.println(longestCommonPrefix(strs2));
    }

}
