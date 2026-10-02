public class TestClass {
    public static void main(String[] args){
        ListReferenceBased list = new ListReferenceBased();

        // Testing Methods
        System.out.println("List empty? " + list.isEmpty());

        System.out.println("\nList size: " + list.size());
        list.add(1, "WarDogs");
        list.add(2, "Valorant");
        list.add(3, "Simona");
        System.out.println("List size after add(): " + list.size());

        System.out.println("\nindex 1: " + list.get(1));
        System.out.println("index 2: " + list.get(2));
        System.out.println("index 3: " + list.get(3));

        list.remove(2);
        System.out.println("\nList size after remove(): " + list.size());

        list.removeAll();
        System.out.println("\nList size after removeAll(): " + list.size());

        
    }
}
