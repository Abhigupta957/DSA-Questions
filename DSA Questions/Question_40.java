import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Question_40 {
    // Function to detect loop using Floyd's Algorithm
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;           // move 1 step
            fast = fast.next.next;      // move 2 steps

            if(slow == fast){     // collision means loop exists
                return true;
            }
        }
        return false;    // reached end, no loop
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        if(n == 0){
            System.out.println("false");
            return;
        }

        System.out.println("Enter node values:");
        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;

        ListNode[] nodes = new ListNode[n];
        nodes[0] = head;

        for(int i = 1; i < n; i++){
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
            nodes[i] = temp;
        }

        System.out.print("Enter position to create loop (-1 for no loop): ");
        int pos = sc.nextInt();

        if(pos >= 0 && pos < n){
            temp.next = nodes[pos];  // create loop
        }

        System.out.println(hasCycle(head));
    }
}

