class Solution {
    Stack <Integer> st = new Stack<>();

    public void collision(int[] asteroids, int j){
          for(int i = j; i<asteroids.length; i++){
            
            if(asteroids[i] < 0){

                if(st.isEmpty() || st.peek() < 0){
                    st.push(asteroids[i]);
                }
                
                else{
                    int k = st.peek();
                    
                    if(k > Math.abs(asteroids[i])){
                        continue;
                    }
                    
                    else if(k== Math.abs(asteroids[i])){
                        st.pop();
                    }
                    
                    else{ 
                    st.pop();
                    collision(asteroids,i);
                    return;
                    }
                }
            }
            else{
             st.push(asteroids[i]);
            }
        }
    }
    
    public int[] asteroidCollision(int[] asteroids) {
        collision(asteroids,0);
        int[] arr = new int[st.size()];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }
    return arr;    
    }
}