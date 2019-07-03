package offer;


/**
 * @ClassName Test_02
 * @Author (ノ ￣ ▽ ￣) LR
 * @Date 2019/7/3 14:18
 * @Description 题目描述：请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 **/
public class Test_02 {

    public static void main(String[] args) {
        StringBuffer testStr = new StringBuffer("We Are Happy ");
        System.out.println(replaceSpace(testStr));
    }

    public static String replaceSpace(StringBuffer str) {
        StringBuffer result = new StringBuffer();
        if (null != str) {
            String s = str.toString();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(' '== c){
                    result.append("%20");
                }else {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}
