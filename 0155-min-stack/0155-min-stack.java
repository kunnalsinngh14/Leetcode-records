class MinStack {
    Stack <Integer> st = new Stack<>();
    Stack <Integer> minst = new Stack<>();
    int min = Integer.MAX_VALUE;
    public MinStack() {
        
    }
    
    public void push(int value) {
        if(value<=min){
            min = value;
            minst.push(min);
        }
        st.push(value);
    }
    
    public void pop() {
        int popped = st.pop();
        if(popped==minst.peek()){
            minst.pop();
            if(!minst.isEmpty()){
                min = minst.peek();
            } else {
                min = Integer.MAX_VALUE;
            }
        }
    }
    
    public int top() {
        if(!st.isEmpty()){
            return st.peek();
        }
        return -1; 
    }
    
    public int getMin() {
        if(!minst.isEmpty()){
            return minst.peek();
        }
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */