import java.util.Scanner;

public class TestClass {
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
        stack.displayStack();

        System.out.println(isBalanced("Simona"));
        System.out.println(isBalanced("{{{Simona}"));
        System.out.println(isBalanced("{Simona}}"));
        System.out.println(isBalanced("{Simona}"));



        
    }//main
}//class
