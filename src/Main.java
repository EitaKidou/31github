import java.util.Arrays;
import java.util.Stack;


class Solution {
    public String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}

class Solution1 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char curr : s.toCharArray()) {
            if (curr == '(' || curr == '[' || curr == '{') {
                stack.push(curr);
            } else if (!stack.isEmpty() && isMatchingPair(stack.peek(), curr)) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    private boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');


    }
//    class Solution2 {
//        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//            ListNode dummy=new ListNode(0);
//            ListNode ans=dummy;
//            while(list1!=null && list2!=null)
//            {
//                if(list1.val<=list2.val)
//                {
//                    ListNode temp=new ListNode(list1.val);
//                    dummy.next=temp;
//                    dummy=dummy.next;
//                    list1=list1.next;
//                }
//                else
//                {
//                    ListNode temp=new ListNode(list2.val);
//                    dummy.next=temp;
//                    dummy=dummy.next;
//                    list2=list2.next;
//                }
//            }
//            while(list1!=null)
//            {
//                ListNode temp=new ListNode(list1.val);
//                dummy.next=temp;
//                dummy=dummy.next;
//                list1=list1.next;
//            }
//            while(list2!=null)
//            {
//                ListNode temp=new ListNode(list2.val);
//                dummy.next=temp;
//                dummy=dummy.next;
//                list2=list2.next;
//            }
//            return ans.next;
//        }
//    }}

