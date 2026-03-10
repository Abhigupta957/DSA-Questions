import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class Question_42 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Input first list
        System.out.print("Enter size of list1: ");
        int n1 = sc.nextInt();

        ListNode l1 = null, temp = null;

        if(n1 > 0){
            System.out.println("Enter elements of list1:");
            l1 = new ListNode(sc.nextInt());
            temp = l1;

            for(int i = 1; i < n1; i++){
                temp.next = new ListNode(sc.nextInt());
                temp = temp.next;
            }
        }

        // Input second list
        System.out.print("Enter size of list2: ");
        int n2 = sc.nextInt();

        ListNode l2 = null;

        if(n2 > 0){
            System.out.println("Enter elements of list2:");
            l2 = new ListNode(sc.nextInt());
            temp = l2;

            for(int i = 1; i < n2; i++){
                temp.next = new ListNode(sc.nextInt());
                temp = temp.next;
            }
        }

        // Merge lists
        ListNode dummy = new ListNode(0);
        temp = dummy;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }

        if(l1 != null) temp.next = l1;
        if(l2 != null) temp.next = l2;

        // Print merged list
        System.out.print("Merged List: ");
        temp = dummy.next;

        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}