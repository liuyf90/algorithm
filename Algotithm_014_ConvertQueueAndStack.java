import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class Algotithm_014_ConvertQueueAndStack {

    public static void main(String[] args) {

    }

    // 用栈实现队列
    public static class MyQueue {
        Stack<Integer> in; 
        Stack<Integer> out;
        public MyQueue() {
            in=new Stack<Integer>();
            out=new Stack<Integer>();
        }
        private void pushtoPop(){
            if(out.empty()){
                while(!in.isEmpty()){
                    out.push(in.pop());
                }
            }
        }
        
        public void push(int x) {
            in.push(x);
            pushtoPop();
            
        }
        
        public int pop() {
            pushtoPop();
            return out.pop();
        }
        
        public int peek() {
            pushtoPop();
            return out.peek(); 
        }
        
        public boolean empty() {
            return out.empty() && in.empty();
        }
    }

    // 用队列实现栈
    public static class MyStack {
        Queue<Integer> queue;
        public MyStack() {
            queue=new LinkedList<Integer>();
        }

        public void push(int x) {
            int n=queue.size();
            queue.offer(x);
            for(int i=0; i<n;i++){
                queue.offer(queue.poll());
            }
            

        }

        public int pop() {
            return queue.poll();
        }

        public int top() {
            return queue.peek();

        }

        public boolean empty() {
           return  queue.size()==0;
        }
    }
}