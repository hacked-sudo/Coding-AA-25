package com.coding;

public class LinkedList_Custom {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        int size (){
            return size;
        }

        void display(){
            Node pointer = head;
            while(pointer != null){
                System.out.println(pointer.data);
                pointer = pointer.next;
            }
        }

        void removeFirst(){
            if(size == 0){
                System.out.println("List is Empty");
            }else if(size == 1){
                head = tail = null;
                size = 0;
            }else{
                head = head.next;
                size--;
            }
        }

        void removeLast(){
            if(size == 0){
                System.out.println("List is Empty");
            }else if(size == 1){
                head = tail = null;
                size = 0;
            }else{
                Node temp = head;
                for(int i = 0;i < size - 2; i++){
                    temp = temp.next;
                }
                tail = temp;
                tail.next = null;
                size--;
            }
        }

        void removeAt(int idx){
            if(size == 0){
                System.out.println("List is Empty");
            }else if(idx == 0){
                head = tail = null;
                size = 0;
            } else if (idx == size - 1){
                removeLast();
            }else{
                Node temp = head;
                for(int i = 0;i < idx - 1; i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
        }

        void addLast(int val){
            Node temp = new Node(); // Taking the common part out including size
            temp.data = val;
            temp.next = null;

            if(size == 0){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
                size++;
            }
            size++;

        }

        int getFirst(){
            if(size == 0){
                System.out.println("List is Empty");
                return -1;
            } else{
            return head.data;
            }
        }

        int getLast(){
            if(size == 0){
                System.out.println("List is Empty");
                return -1;
            }else{
                return tail.data;
            }
        }

        int getAt(int idx){
            if(size == 0){
                System.out.println("List is Empty");
                return -1;
            }else{
                Node temp = head;
                for(int i = 0; i < idx; i++){
                    temp = temp.next;
                }
                return temp.data;
            }
        }

        void addFirst(int val){
            Node temp = new Node();
            temp.data = val;

            if(size == 0){
                head = tail = temp;
                temp.next = null;

            } else {
                temp.next = head;
                head = temp;
            }
            size++;

        }

        void addAt(int idx, int val){

            if (idx > size || idx < 0){
                System.out.println("Invalid Argument");
            } else if (idx == 0){
                addFirst(val);
            } else if (idx == size){
                addLast(val);
            } else {
                Node newNode = new Node();
                newNode.data = val;
                Node temp = head;

                for(int i = 0; i < idx - 1; i++){
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
                size++;
            }
        }

        void reversePointer(){
            Node previous = null;
            Node current = head;

            while(current != null){
                Node nextNode = current.next;

                current.next = previous;

               previous = current;
               current = nextNode;
            }
            Node temp = head;
            head = tail;
            tail = temp;
        }

        //This method doesn't actually reverses the ll but prints it in reverse order.
        void displayReverseUsingRecursion(Node node){ //node would be equal to head when call = 1
            if(node == null){
                return;
            }

            displayReverseUsingRecursion(node.next);
            System.out.print(node.data + "");
        }

        public void reversePR(){
            reverPointerRecursiveHelper(head);
            head.next = null;

            Node temp = head;
            head = tail;
            tail = temp;
        }

        private void reverPointerRecursiveHelper(Node node){
            if(node == null){
                return;
            }
            reverPointerRecursiveHelper(node.next);
            // returning code of recursive call are written just below the recursion call
            if(node == tail){
                //nothing to do as node.next.next is not present
            } else {
                node.next.next = node; // reversing the connection here for n-1, and thereafter
            }
        }
        Node ll_left = head;
        // Below method is in O(n)
        //floor is to check and swap only till half time size for odd n, and less than half for even n
        private void reverseLLDataRecursive(Node right, int floor){

            if(right == null){
                return;
            }
            reverseLLDataRecursive(right.next, floor++);
            // returning code of recursive call are written just below the recursion call
            if(floor >= size / 2){ // equal to depends on n
                int temp = ll_left.data;
                ll_left.data = right.data;
                right.data = temp;

                ll_left = ll_left.next;
            }

        }
        Node left_lldPalindrome = head;
        boolean isLLPalindrome(Node right){
            if(right == null){
                return true;
            }
            boolean rec_Result = isLLPalindrome(right.next);
            if(rec_Result == false){
                return false;
            } else if (right.data != left_lldPalindrome.data) {
                return false;
            } else{
            left_lldPalindrome = left_lldPalindrome.next;
            return true;
            }
    }
        int getKthNodeFromLast(int k){
            Node slow = head;
            Node fast = head;

            for(int i = 0; i < k; i++){
                fast = fast.next;
            }

            while(fast != tail){
                slow = slow.next;
                fast = fast.next;
            }
            return slow.data;
        }
        Node fold_ll_left = head;
        void  foldLinkedList(Node right, int floor){
            if(right == null){
                return;
            }
            foldLinkedList(right.next, floor+1);
            if(floor > size/2){
                Node temp = fold_ll_left.next;
                fold_ll_left.next = right;
                right.next = temp;

                fold_ll_left = fold_ll_left.next;

            }else if(floor == size/2){
                tail = right;
                tail.next = null;
            }
        }

        int mid(){
            Node slow = head;
            Node fast = head;

            while(fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }
    }


    public static LinkedList MergeTwoSortedLl (LinkedList l1, LinkedList l2){
        Node one = l1.head;
        Node two = l2.head;
        LinkedList resultant = new LinkedList();

        while(one != null && two != null){
            if(one.data < two.data){
                resultant.addLast(one.data);
                one = one.next;
            }else {
                resultant.addLast(two.data);
                two = two.next;
            }
        }
        while(one != null){
            resultant.addLast(one.data);
            one = one.next;
        }
        while(two != null){
            resultant.addLast(two.data);
            two = two.next;
        }

        return resultant;

    }

    public static Node midNode(Node head, Node tail){
        Node slow = head;
        Node fast = head;

        while(fast != tail && fast.next != tail){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static LinkedList mergeSort(Node head, Node tail){
        if(head == tail){
            LinkedList baseResult = new LinkedList();
            baseResult.addLast(head.data);
            return baseResult;
        }

        Node mid = midNode(head, tail);
        LinkedList firstHalf = mergeSort(head, mid);
        LinkedList secHalf = mergeSort(mid.next, tail);

        LinkedList result = MergeTwoSortedLl(firstHalf, secHalf);
        return result;

    }

    public void removeDuplicate(LinkedList ll){
        LinkedList result = new LinkedList();

        while(ll.size() > 0){
            int val = ll.getFirst();
            ll.removeFirst();

            if(ll.size() > 0 || result.getLast() != val){
                result.addLast(val);
            }

        }

        //update the previouis linkedList reference with the new one created
        ll.head = result.head;
        ll.tail = result.tail;
        ll.size = result.size;       // check size variable or function
    }

    public void oddEven(LinkedList ll){
        LinkedList odd = new LinkedList();
        LinkedList even = new LinkedList();

        while(ll.size > 0){
            int val = ll.getFirst();
            ll.removeFirst(); // adding and removing to keep space constant.

            if(val % 2 != 0){
                odd.addLast(val);
            }else {
                even.addLast(val);
            }
        }
        //Lets update the current ll, also manage case when data is present only odd or even
        if(odd.size > 0 && even.size >0) {
            odd.tail = even.head;
            ll.size = even.size + odd.size;
            ll.head = odd.head;
            ll.tail = even.tail;
        } else if(odd.size > 0){
            ll.size = odd.size;
            ll.head = odd.head;
            ll.tail = odd.tail;
        } else if(even.size > 0){
            ll.size = even.size;
            ll.head = even.head;
            ll.tail = even.tail;
        }

    }

    public void kReverse(int k, LinkedList ll){
        LinkedList prev = null;

        while(ll.size > 0){
            LinkedList curr = new LinkedList();

            if(ll.size > k){
                for(int i = 0; i < k; i++){
                    int val = ll.getFirst();
                    ll.removeFirst();
                    curr.addFirst(val); // reverse logic
                }

            }else {
                int originalSize = ll.size();
                for(int i = 0; i < originalSize; i++){
                    int val = ll.getFirst();
                    ll.removeFirst();
                    curr.addLast(val); // reverse logic
                }
            }

            if(prev == null){
                prev = curr;
            } else {
                prev.tail.next = curr.head;
                prev.tail = curr.tail;
                prev.size += curr.size;
            }
        }
    }


    public static int addTwollHelper(Node one, int placeV_one, Node two, int placeV_two, LinkedList result) {

        if(one == null && two == null){
            return 0;
        }
        int data = 0;
        if(placeV_one > placeV_two){
            int oldCarry = addTwollHelper(one.next, placeV_one - 1, two, placeV_two - 1, result);
            data = one.data + oldCarry;

        }else if(placeV_two > placeV_one){
            int oldCarry = addTwollHelper(one, placeV_one - 1, two.next, placeV_two - 1, result);
            data = two.data + oldCarry;

        } else {
            int oldCarry = addTwollHelper(one.next, placeV_one - 1, two.next, placeV_two - 1, result);
            data = one.data + two.data + oldCarry;
        }

        int newData = data % 10;
        int newCarry = data / 10;
        result.addFirst(newData);
        return newCarry;
    }

    public static LinkedList addTwoLinkedList(LinkedList one, LinkedList two){
        LinkedList result = new LinkedList();
        int oc = addTwollHelper(one.head, one.size, two.head, two.size, result);
        return result;
    }

    public static int findIntersection(LinkedList one, LinkedList two){
        Node p1 = one.head;
        Node p2 = two.head;

        int deta = Math.abs(one.size - two.size);
        if(one.size > two.size){
            for(int i = 0; i < deta; i++){
                p1 = p1.next;
            }
        } else {
            for(int i = 0; i < deta; i++){
                p2 = p2.next;
            }
        }

        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1.data;

    }


    public static void main (String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.display();
        ll.reversePointer();
        ll.display();
    }
}
