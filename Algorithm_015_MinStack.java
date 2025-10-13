import java.util.Stack;

public class Algorithm_015_MinStack {
//    https://leetcode.cn/problems/min-stack/description/
    public static void main(String[] args) {

    }

    public static class MinStack {
        Stack<Integer> stack;
        Stack<Integer> min;
     
        public MinStack() {
            stack=new Stack<Integer>();
            min=new Stack<Integer>();
        
        }
        
        public void push(int val) {
            if(min.size()==0||val<min.peek()){
                stack.push(val);
                min.push(val);
            }else{
                stack.push(val);
                min.push(min.peek());
            }

            
        }
        
        public void pop() {
            stack.pop();
            min.pop();
            
        }
        
        public int top() {
            return stack.peek();
            
        }
        
        public int getMin() {
            return min.peek();
            
        }
    }
}
