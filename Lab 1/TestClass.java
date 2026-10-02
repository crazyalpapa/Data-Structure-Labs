public class TestClass {
    public static void displayList(ListInterface list) {
        if (list.isEmpty()) {
            System.out.println("List empty");
            return;
        }

        System.out.print("[ ");
        for (int i = 1; i <= list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size()) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }

    public static void main(String[] args) {
        ListInterface list = new ListArrayBased();

        //1 Test isEmpty()
        System.out.println("Test 1");
        System.out.println("Is list empty? " + list.isEmpty()); 
        System.out.println("Size: " + list.size());          
        displayList(list);
        System.out.println();

        //2 Test add(index, item)
        System.out.println("Test 2");
        list.add(1, "Apple");
        list.add(2, "Banana");
        list.add(3, "Cherry");
        // Insert at the beginning (position 1)
        list.add(1, "Avocado"); 
        // Insert in the middle (position 3)
        list.add(3, "Blueberry"); 

        System.out.println("Is list empty? " + list.isEmpty()); 
        System.out.println("Size: " + list.size());        
        displayList(list);
        System.out.println();

        //3 Test get(index)
        System.out.println("Test 3");
        System.out.println("Item at index 1: " + list.get(1)); 
        System.out.println("Item at index 3: " + list.get(3)); 
        System.out.println();

        //4 Test remove(index)
        System.out.println("Test 4");
        System.out.println("Removing index 1");
        list.remove(1); 
        displayList(list);

        System.out.println("Removing index 3");
        list.remove(3); 
        displayList(list);
        System.out.println();

        //5 Test Exception Handling
        System.out.println("Test 5");
        try {
            list.get(10);
        } catch (ListIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        System.out.println();

        //6 Test removeAll()
        System.out.println("Test 6");
        System.out.println("List before removal:");
        displayList(list);
        list.removeAll();
        System.out.println("List after removal:");
        System.out.println("Is list empty? " + list.isEmpty()); 
        System.out.println("Size: " + list.size());                               
        displayList(list);
    }
}