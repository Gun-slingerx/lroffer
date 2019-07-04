package offer;


/**
 * @ClassName Test_04
 * @Author (ノ ￣ ▽ ￣) LR
 * @Date 2019/7/4 9:18
 * @Description 题目描述 ： 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 **/
public class Test_04 {

    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        Test_04 test_04 = new Test_04();
        TreeNode treeNode = test_04.reConstructBinaryTree(pre,in);
    }


    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (null != pre && null != in) {
            //获取根节点
            TreeNode root = new TreeNode(pre[0]);

            int len = pre.length;
            if (1 == len) {
                root.left = null;
                root.right = null;
                return root;
            }

            //找到中序的根位置
            int rootval = root.val;
            int i;
            for (i = 0; i < len; i++) {
                if (rootval == in[i]) {
                    break;
                }
            }

            //构造左子树
            if (i > 0) {
                int[] pr = new int[i];
                int[] ino = new int[i];
                for (int j = 0; j < i; j++) {
                    pr[j] = pre[j + 1];
                }
                for (int j = 0; j < i; j++) {
                    ino[j] = in[j];
                }
                root.left = reConstructBinaryTree(pr, ino);
            } else {
                root.left = null;
            }

            //构造右子树
            if (len - i - 1 > 0) {
                int length = len - i - 1;
                int[] pr = new int[length];
                int[] ino = new int[length];
                for (int j = i + 1; j < len; j++) {
                    pr[j-i-1] = pre[j];
                    ino[j-i-1] = in[j];
                }
                root.right = reConstructBinaryTree(pr, ino);
            } else {
                root.right = null;
            }
            return root;
        }
        return null;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
