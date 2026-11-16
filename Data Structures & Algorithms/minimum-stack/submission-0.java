class MinStack {

    private Stack<Integer> minStack;
    private Stack<Integer> s;
    public MinStack() {
       s = new Stack<>();
       minStack = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            int currentMin = minStack.peek();
            if(val < currentMin) {
                minStack.push(val);
            } else {
                 minStack.push(currentMin);
            }
        }
    }
    
    public void pop() {
        s.pop();
        minStack.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
