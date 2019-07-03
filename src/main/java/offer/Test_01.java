package offer;

/**
 * @ClassName Test_01
 * @Author (ノ ￣ ▽ ￣) LR
 * @Date 2019/7/3 11:25
 * @Description 题目描述： 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 **/

public class Test_01 {

    public static void main(String[] args) {
        int[][] array = new int[3][3];
        //给数组赋值
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;
        System.out.println(Find(19, array));;
    }

    public static boolean Find(int target, int[][] array) {

        //获取行数和列数
        int rowCount = array.length;
        int colCount = array[0].length;
        int num = colCount - 1;

        //由于二位数据中数组是按顺序排序 于是使用target与左上角元素比较 如果小此元素 则向左移动 如果大于此元素 则向下移动
        for (int i = 0; i < rowCount && num >=0; ) {
            //相等则返回
            if(target == array[i][num]){
                return true;
            }
            //小于则向左移动
            if(target < array[i][num]){
                num -- ;
                continue;
            }

            //大于则向下移动
            if(target > array[i][num]){
                i++ ;
                continue;
            }
        }
        return false;
    }
}
