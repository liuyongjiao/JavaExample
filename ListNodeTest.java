class ListNode{
     int val;
     ListNode next;
    public ListNode(int v){
        this.val = v;
    }
}

public class ListNodeTest {
    public void insert( ListNode node, int k){
        int i = 0;
        ListNode p = head;
        ListNode q = p.next;
        while(q != null && i < k){
            p = q;
            q = q.next;
            i++;
        }

        if(p != null){
            p.next = node;
            node.next = q;
        }
        else{
            head.next = node;
        }



    }
    public void del(int val){
        ListNode p = head;
        ListNode q = p.next;

        while(q != null && q.val != val){
            p = q;
            q = q.next;
        }

        if(q != null){
            p.next = q.next;
        }
    }

    public void  createList(int k){
        this.head = new ListNode(-1);
        for(int i = 0; i < k; i++){
            ListNode node = new ListNode(i);
            insert(node, i);
        }

    }
    public void printLst(){
        ListNode p = head.next;
        while(p != null){
            System.out.println(p.val);
            p = p.next;
        }

    }

    public static void main(String[] args){
        ListNodeTest lnt = new ListNodeTest();
        lnt.createList(3);
        lnt.printLst();
        lnt.del(1);
        lnt.printLst();
        lnt.del( 0);
        lnt.printLst();
    }

    private  ListNode head;
    public ListNode get(){
        return head;
    }
}


