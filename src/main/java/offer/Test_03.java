package offer;

import java.util.ArrayList;

/**
 * @ClassName Test_03
 * @Author (ノ ￣ ▽ ￣) LR
 * @Date 2019/7/3 14:40
 * @Description 题目描述:输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 **/
public class Test_03 {

    public static void main(String[] args) {
        Test_03 test_03 = new Test_03();
        ListNode listNode = test_03.getListNode();
        ArrayList<Integer> arrayList = test_03.printListFromTailToHead(listNode);
        System.out.println(arrayList.toString());
    }

    ListNode getListNode(){
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        return listNode1;
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (listNode == null){
            return res;
        }
        ListNode p = listNode;
        while (p != null) {
            res.add(p.val);
            p = p.next;
        }

        for (int i = res.size()-1; i>=0; i--){
            result.add(res.get(i));
        }
        return result;
    }

    class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
}
