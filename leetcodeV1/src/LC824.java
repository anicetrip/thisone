/**
 * 824. 山羊拉丁文
 *给你一个由若干单词组成的句子 sentence ，单词间由空格分隔。每个单词仅由大写和小写英文字母组成。
 *
 * 请你将句子转换为 “山羊拉丁文（Goat Latin）”（一种类似于 猪拉丁文 - Pig Latin 的虚构语言）。山羊拉丁文的规则如下：
 *
 * 如果单词以元音开头（'a', 'e', 'i', 'o', 'u'），在单词后添加"ma"。
 * 例如，单词 "apple" 变为 "applema" 。
 * 如果单词以辅音字母开头（即，非元音字母），移除第一个字符并将它放到末尾，之后再添加"ma"。
 * 例如，单词 "goat" 变为 "oatgma" 。
 * 根据单词在句子中的索引，在单词最后添加与索引相同数量的字母'a'，索引从 1 开始。
 * 例如，在第一个单词后添加 "a" ，在第二个单词后添加 "aa" ，以此类推。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/goat-latin
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author 21001596_ZHENGTAO YIN
 * @date 2022/04/20 22:10
 **/
public class LC824 {


    public static void main(String[] args) {
        String a = new LC824().toGoatLatin("I speak Goat Latin");
        System.out.println(a);
    }

    public String toGoatLatin(String sentence) {

        String[] wordList = sentence.split("\\s+");
        int index = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : wordList) {
            if (s.charAt(0) == 'a' || s.charAt(0) == 'e' ||s.charAt(0) == 'i' ||s.charAt(0) == 'o' ||s.charAt(0) == 'u' || s.charAt(0) == 'A' || s.charAt(0) == 'E' ||s.charAt(0) == 'I' ||s.charAt(0) == 'O' ||s.charAt(0) == 'U'){
                s += "ma";
            }else {
                s += s.charAt(0);
                s = s.substring(1);
                s += "ma";
            }
            s += "a".repeat(index);
            stringBuilder.append(s).append(" ");
            index ++;
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }

}
 