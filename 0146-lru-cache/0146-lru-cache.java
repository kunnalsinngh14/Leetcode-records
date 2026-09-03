class LRUCache {
    int cap = 0;
    HashMap<Integer,Integer> map =new HashMap<>();
    LinkedList<Integer> list = new LinkedList<>();   
    public LRUCache(int capacity) {
        cap = capacity;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        list.add(key);
        list.removeFirstOccurrence(key);
        return map.get(key);
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.put(key,value);
            list.add(key);
            list.removeFirstOccurrence(key);
            return;
        }
        else if(list.size()>=cap){
            int head = list.poll();
            map.remove(head);
        }
        list.add(key);
        map.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */