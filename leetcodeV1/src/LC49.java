import java.util.ArrayList;
import java.util.List;

public class LC49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> finalList = new ArrayList<List<String>>();
         


        return finalList;
    }
}


// 答案里面的getordefault很特别，可以节约一次if操作。
//     public List<List<String>> groupAnagrams(String[] strs) {
//     Map<String, List<String>> map = new HashMap<String, List<String>>();
//     for (String str : strs) {
//         char[] array = str.toCharArray();
//         Arrays.sort(array);
//         String key = new String(array);
//         List<String> list = map.getOrDefault(key, new ArrayList<String>());
//         list.add(str);
//         map.put(key, list);
//     }
//     return new ArrayList<List<String>>(map.values());
// }

// 作者：LeetCode-Solution
// 链接：https://leetcode.cn/problems/group-anagrams/solution/zi-mu-yi-wei-ci-fen-zu-by-leetcode-solut-gyoc/
// 来源：力扣（LeetCode）
// 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。