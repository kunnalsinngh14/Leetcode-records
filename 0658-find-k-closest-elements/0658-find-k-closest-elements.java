class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>();
        for(int i : arr){
            if(k>maxheap.size()){
                maxheap.add(i);
            }
            else{
                int peekdiff = Math.abs(maxheap.peek() - x);
                int elediff = Math.abs( i - x);
                if(elediff<peekdiff){
                    maxheap.poll();
                    maxheap.add(i);
                }
            }
        }
        List<Integer> list = new ArrayList<>(maxheap);
        Collections.sort(list);
        return list;
    }
}