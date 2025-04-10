package com.coding;

import java.util.*;

public class GenericTree {
    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node(){

        }
        Node(int data){
            this.data = data;
        }
    }

    public static void display(Node node){
        String data = node.data + "->";
        for(Node childNode : node.children){
            data += childNode.data + ",";
        }
        data += ".";
        System.out.println(data);

        for(Node childNode : node.children){
            display(childNode);
        }
    }

    public static int max(Node node){
        int max = Integer.MIN_VALUE;
        for(Node childNode : node.children){
            int childMax = max(childNode);
            max = Math.max(childMax, max);
        }
        max = Math.max(node.data, max);
        return max;
    }

    public static int height(Node node){
        int h = -1; // because adding + 1 to base case would make height == 0 in case of edge height, when dealing with height of node take h == 0
        for(Node childNode : node.children){
            int maxChildHeight = height(childNode);
            h = Math.max(maxChildHeight, h);
        }
        return h+1;
    }

    public static void traversal(Node node){
        System.out.println("Node Pre " + node.data);
        for(Node childNode : node.children){
            System.out.println("Edge Pre " + node.data + "--" + childNode.data);
            traversal(childNode);
            System.out.println("Edge Post " + node.data + "--" + childNode.data);
        }
        System.out.println("Node Post " + node.data);
    }

    public static void levelOrder(Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);

        while(q.size() > 0){
            Node nodeFromQ = q.remove();
            System.out.println(nodeFromQ.data + " ");
            for(Node childNode : nodeFromQ.children){
                q.add(childNode);
            }
        }
        System.out.println(".");
    }
    //Approach with Main Queue and Child Queue
    public static void levelOrderLineWise1(Node node){
        Queue<Node> mainQ = new ArrayDeque<>();
        Queue<Node> sideQ = new ArrayDeque<>();
        mainQ.add(node);

        while(mainQ.size() > 0){
            node = mainQ.remove();
            System.out.println(node.data + " ");
            for(Node childNode : node.children){
                sideQ.add(childNode);
            }

            if(mainQ.size() == 0){
                mainQ = sideQ;
                sideQ = new ArrayDeque<>();
                System.out.println();
            }

        }
    }
    //Approach 2 counting level wise child node in queue size
    public static void levelOrderLineWise2(Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);

        while(q.size() > 0){
            int nodeLevelSize = q.size();

            for(int i = 0; i < nodeLevelSize; i++){
                node = q.remove();
                System.out.println(node.data + " ");

                for(Node child : node.children){
                    q.add(child);
                }
            }
            System.out.println();

        }
    }
    //levelwise traversal with marker to identify null and adding again at end if size != 0
    public static void levelOrderLineWise3(Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        q.add(new Node(-1));

        while(q.size() > 0){
            node = q.remove();
            if(node.data != -1){
                System.out.println(node.data + " ");

                for(Node child : node.children){
                    q.add(child);
                }
            } else {
                if(q.size() > 0){
                    q.add(new Node(-1));
                    System.out.println();
                }
            }

            System.out.println();

        }
    }
    public static class Pair {
        Node node;
        int level;

        Pair(){

        }
        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }
    //maintaining level with pari approch
    public static void levelOrderLineWise4(Node node){
       Queue<Pair> q = new ArrayDeque<>();
       q.add(new Pair(node, 1));

       int level = 1;

       while(q.size() > 0){
           Pair p = q.remove();
           if(p.level > level){
               level = p.level;
               System.out.println();
           }

           System.out.println(p.node.data + " ");
           for(Node child : p.node.children){
               q.add(new Pair(child, level + 1));
           }
       }
    }



    public static int size(Node node){
        int s = 0;
        for(Node childNode : node.children){
            s += size(childNode);
        }
        return s + 1;
    }

    public static void mirror(Node node){
        for(Node child : node.children){
            mirror(child);
        }

        Collections.reverse(node.children);
    }

    public static void removeLeaf(Node node){
        //write the code in pre part of leaf removal to save us from logical leaf removal error, loop is reverser to avoid concurrent modification exception.
        //always remove it from pre code, in post code it may remove leaf which was not really a leaf node.
        for(int i = node.children.size() - 1; i >= 0; i--){
            Node child = node.children.get(i);
            if(child.children.size() == 0){
                node.children.remove(child);
            }
        }

        for(Node child : node.children){
            removeLeaf(child);
        }


    }
    public static Node getTail(Node node){
        while(node.children.size() == 1){
            node = node.children.get(0);
        }
        return node;
    }
    //O (n^2)
    public static void linearize(Node node){
        for(Node child : node.children){
            linearize(child);
        }

        while(node.children.size() > 1){
            Node lastChild = node.children.remove(node.children.size() - 1);
            Node secondLastChild = node.children.get(node.children.size() - 1);
            Node secLastNode = getTail(secondLastChild);
            secLastNode.children.add(lastChild);
        }
    }
    // O (n)
    public static Node linearizeEfficient(Node node){
        Node LastNodeTail = linearizeEfficient(node.children.get(node.children.size() - 1));

        while(node.children.size() > 1){
            Node last = node.children.remove(node.children.size() - 1);
            Node secLast = node.children.get(node.children.size() - 1);
            Node secLastTail = linearizeEfficient(secLast);
            secLastTail.children.add(last);

        }
        return LastNodeTail;

    }

    public static boolean findElement(Node node, int data){
        if(node.data == data){
            return true;
        }

        for(Node child : node.children){
            boolean found = findElement(child, data);
            if(found){
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Integer> nodeToRootPath(Node node, int data){
        if(node.data == data){
            ArrayList<Integer> list = new ArrayList<>(node.data);
          return list;
        }

        for(Node child : node.children){
            ArrayList<Integer> pathTillChild = nodeToRootPath(child, data);
            if(pathTillChild.size() > 0){
                pathTillChild.add(child.data);
                return pathTillChild;
            }
        }
        return new ArrayList<>();
    }

    public static int loweseCommonAncestor(Node node, int d1, int d2){
        ArrayList<Integer> arr1 = nodeToRootPath(node, d1);
        ArrayList<Integer> arr2 = nodeToRootPath(node, d2);

        int i = arr1.size() - 1;
        int j = arr2.size() - 1;

        while(i >= 0 && j >= 0 && arr1.get(i) == arr2.get(j)){
            i--;
            j--;

        }
        i++;
        j++;
        return arr1.get(i);
    }

    public static int distanceBetweentheNodes(Node node, int d1, int d2){
        ArrayList<Integer> arr1 = nodeToRootPath(node, d1);
        ArrayList<Integer> arr2 = nodeToRootPath(node, d2);

        int i = arr1.size() - 1;
        int j = arr2.size() - 1;

        while(i >= 0 && j >= 0 && arr1.get(i) == arr2.get(j)){
            i--;
            j--;

        }
        i++;
        j++;
        return i + j;
    }
    public static boolean areMirrorInShape(Node n1, Node n2){
        if(n1.children.size() != n2.children.size()){
            return false;
        }

        for(int i = 0; i < n1.children.size(); i++){
            int j = n2.children.size() - 1- i;
            Node child1 = n1.children.get(i);
            Node child2 = n2.children.get(j);

            if(areMirrorInShape(child1,child2) == false){
                return false;
            }

        }
        return true;
    }

    //Through multisolver max min size and depth can be taken out in one GO,
    //its just you have to take a 4 heap vairable

    public static void main(String[] args){
        int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        Node root = null;
        Stack<Node> st = new Stack<>();
        for(int i = 0;i < arr.length; i++){
            if(arr[i] == -1){
                st.pop();
            } else {
                Node newNode = new Node();
                newNode.data = arr[i];
                if(st.size() == 0){
                    root = newNode;
                    st.push(newNode);
                } else {
                    st.peek().children.add(newNode);
                    st.push(newNode);

                }
            }
        }

        levelOrder(root);


    }
}
