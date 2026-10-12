public class MiddleNodeDemo {

    public static void main(String[] args) {

        System.out.println("=== Find Middle Node Demo ===");
        System.out.println();

        // -------------------------------------------------------
        // Test 1: Odd number of nodes
        // TODO: 
        // 1. Created a singlyLİnkedList
        // 2. Add 1,2,3,4,5 Nodes to the list
        // 3. Display the list
        // 4. Found and print the middle Node
        SinglyLinkedList list1 = new SinglyLinkedList();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);



        System.out.println("List 1:");
        list1.display();


        Node mid1 = list1.findMiddle();
        System.out.println("Middle Node: " + mid1.data);
        System.out.println();

        // -------------------------------------------------------
        // Test 2: Even number of nodes
        // TODO: 
        // 1. Created another singlyLİnkedList
        // 2. Add 10,20,30,40,50,60 Nodes to the list
        // 3. Display the list
        // 4. Found and print the middle Node
        SinglyLinkedList list2 = new SinglyLinkedList();

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);


        System.out.println("List 2:");
        list2.display();

        Node mid2 = list2.findMiddle();
        System.out.println("Middle Node: " + mid2.data);
        System.out.println();
    }
}