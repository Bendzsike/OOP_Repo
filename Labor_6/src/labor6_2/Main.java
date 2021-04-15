package labor6_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        String str = "Bodor Benjamin";
//        StackAggregation stack1 = new StackAggregation(str.length());
//        for(int i = 0; i < str.length(); ++i) {
//            stack1.push(str.charAt(i));
//        }
//        while(!stack1.isEmpty()) {
//            System.out.print(stack1.top());
//            stack1.pop();
//        }
//        System.out.println();
//
//        StackAggregation stack2 = new StackAggregation(10);
//        Random rand = new Random();
//        for(int i = 0; i < 13; ++i) {
//            int temp = rand.nextInt(100);
//            System.out.println(temp);
//            stack2.push(temp);
//        }
//        System.out.println();
//        while(!stack2.isEmpty()) {
//            System.out.print(stack2.top() + " ");
//            stack2.pop();
//        }
//        System.out.println();
//
//        StackAggregation stack3 = new StackAggregation(5);
//        stack3.push("Bodor Benjamin");
//        stack3.push(2.3);
//        stack3.push('X');
//        stack3.push(10);
//
//        System.out.println();
//        while(!stack3.isEmpty()) {
//            System.out.print(stack3.top() + " ");
//            stack3.pop();
//        }
//        System.out.println();

        StackAggregation stack1 = new StackAggregation( 5 );
        for( int i=0; i<10; ++i ){
// boxing: int --> Integer
            stack1.push( i );
        }
        System.out.print("StackAggregation : ");
        while( !stack1.isEmpty() ){
            System.out.print( stack1.top() + " ");
            stack1.pop();
        }
        System.out.println();
        StackInheritance stack2 = new StackInheritance( 5 );
        for( int i=0; i<10; ++i ){
            stack2.push( i );
        }
        stack2.remove( 1 );
        System.out.print("StackInheritance : ");
        while( !stack2.isEmpty() ){
            System.out.print( stack2.top() + " ");
            stack2.pop();
        }
        System.out.println();
    }
}
