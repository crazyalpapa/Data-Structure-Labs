import java.util.Scanner;

public class TestClass {
    public static void Menu(){
        System.out.println("\nWelcome to StackTest! Please select a number from the list.");
        System.out.println("1. Push a string into the stack");
        System.out.println("2. Pop a string from the stack");
        System.out.println("3. Peek at the top of the stack");
        System.out.println("4. Empty the stack");
        System.out.println("5. Check if a string is balanced");
        System.out.println("6. Exit");
    }//Menu()
    public static boolean isBalanced(String s) {
        StackReferenceBased stack = new StackReferenceBased();
        boolean balancedSoFar = true;
        int k = 0;
        while(balancedSoFar && k < s.length()) {
            if(s.charAt(k) == '{') {
                stack.push('{');
            }//if
            else if(s.charAt(k) == '}') {
                if(stack.isEmpty()) {
                    balancedSoFar = false;
                }//if
                else {
                    stack.pop();
                }//else
            }//else if

            k++;
        }//while

        if(balancedSoFar && stack.isEmpty()) {
            return true;
        }//if
        else {
            return false;
        }//else
    }//isBalanced()
    public static void main(String[] args) {
        StackReferenceBased stack = new StackReferenceBased();

        stack.push("Simona");
        stack.push("Valorant");
        stack.push("Wardogs");

        System.out.println(isBalanced("Simona"));
        System.out.println(isBalanced("{{{Simona}"));
        System.out.println(isBalanced("{Simona}}"));
        System.out.println(isBalanced("{Simona}"));

        Scanner in = new Scanner(System.in);
        int choice = 0;
        String input;

        stack.displayStack();
        Menu();
        while (choice != 6) {

            choice = in.nextInt();
            in.nextLine();

            if(choice == 1){//Push String
                System.out.print("\nEnter a String: ");
                input = in.nextLine();
                stack.push(input);
                stack.displayStack();
            }
            else if(choice == 2){//Pop String
                if(stack.isEmpty()){  
                    System.out.println("Stack empty");   
                }
                else{                    
                    System.out.println(stack.pop() + " has been popped");
                    stack.displayStack();
                }
            } 
            else if(choice == 3){//Peek at top
                if(stack.isEmpty()){  
                    System.out.println("Stack empty");   
                }
                else{
                    System.out.println("Top of stack: " + stack.peek());
                }
            } 
            else if(choice == 4){//Empty stack
                stack.popAll();
                System.out.println("Stack has been emptied");
            } 
            else if(choice == 5){//Check balanced
                System.out.println("\nEnter a String:");
                input = in.nextLine();
                System.out.println(isBalanced(input));
            }
        }//while
    }//main
}//class
