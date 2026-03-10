import java.util.Scanner;
class ListNode {
    int val; 
    ListNode next;
    
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class Question_41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){ 
            System.out.println("[]");
            return; 
        }

        // Create linked list from input
        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;
        for(int i = 1; i < n; i++){
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }

        // find middle using slow & fast pointers
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Print middle onwards
        while(slow != null){
            System.out.print(slow.val + " ");
            slow = slow.next;
        }
    }
}
