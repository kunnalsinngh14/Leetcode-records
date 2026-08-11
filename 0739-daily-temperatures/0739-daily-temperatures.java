class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            if (st.isEmpty() || temperatures[st.peek()] >= temperatures[i]) {
                st.push(i);
            } else if (temperatures[i] > temperatures[st.peek()]) {

                while (!st.isEmpty() && temperatures[st.peek()] < temperatures[i]) {
                    int k = st.pop();
                    arr[k] = i - k;
                }
                st.push(i);
            }
        }
        return arr;
    }
}