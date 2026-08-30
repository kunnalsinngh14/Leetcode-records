class TimeMap {
    HashMap<String, TreeMap<Integer, String>> map = new HashMap<>();

    public TimeMap() {
    }

    public void set(String key, String value, int timestamp) {

    if (!map.containsKey(key)) {
        map.put(key, new TreeMap<>());
    }

    TreeMap<Integer, String> tmap = map.get(key);
    tmap.put(timestamp, value);
    }   
    

    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }
       TreeMap<Integer,String> tmap = map.get(key);
       Integer ind = tmap.floorKey(timestamp);
       if(ind!=null){
       return tmap.get(ind);
        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */