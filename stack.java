import java.util.Stack;
public class stack {

    public static void main(String args[]){

        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(54);

        System.out.println(stack.pop());                              //54

        System.out.println(stack.pop());

    }
    
}
