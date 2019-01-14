public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r = new ListNode(0);
        ListNode l = r;
        ListNode p = l1;
        ListNode q = l2;
        int sum = 0;
        int carry = 0;
        int a=0;
        int b=0;

        while (p!=null || q!=null){
            if (p == null){ a=0; }else{ a=p.val; }
            if (q == null){ b=0; }else{ b=q.val; }
            sum = a + b+carry;
            carry=0;
            if (sum >= 10){
                carry=1;
                sum=sum-10;
            }
            l.next=new ListNode(sum);
            l=l.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry>0){
            l.next=new ListNode(carry);
        }
        return r.next;

    }
    public static void main(String[] args) {
        AddTwoNumbers a = new AddTwoNumbers();
        ListNode l13 = new ListNode(3);
        ListNode l12 = new ListNode(4);
        l12.next=l13;
        ListNode l1 = new ListNode(2);
        l1.next=l12;

        ListNode l23 = new ListNode(4);
        ListNode l22 = new ListNode(6);
        l22.next = l23;
        ListNode l2 = new ListNode(9);
        l2.next=l22;

        ListNode l3 = a.addTwoNumbers(l1,l22);
        System.out.println(l3.val);
        l3=l3.next;
        System.out.println(l3.val);
        l3=l3.next;
        System.out.println(l3.val);
        l3=l3.next;
        System.out.println(l3.val);
    }
}
