public class StackUsingArray 
{
    int top;
    int size;
    int[] stack;
    StackUsingArray(int size){
        this.size=size;
        stack = new int[size];
        top = -1;
    }
    void push(int value){
        if(top == size-1){
            System.out.println(value);
        }
        else{
            top++;
            stack[top] = value;
            System.out.println(value);
        }
    }
    void pop(){
        if(top == -1){
            System.out.println("Stack Underflow Nothing to pop");
        }
        else{
            int popped = stack[top];
            top--;
            System.out.println(popped);
        }
    }
    void peek(){
        if(top == -1){
            System.out.println("stack is empty ");
        }
        else{
            System.out.println(stack[top]);
        }
    }
    void display(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack:");
            for(int i = top;i>=0;i--){
                System.out.print(stack[i]+"");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        StackUsingArray s = new StackUsingArray(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.pop();
        s.display();
    }
}
