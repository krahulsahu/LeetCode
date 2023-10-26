class MyHashMap {
    HashMap<Integer,Integer> obj = new HashMap<>();
    
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        obj.put(key,value);
    }
    
    public int get(int key) {
         return obj.getOrDefault(key, -1);
    }
    
    public void remove(int key) {
         obj.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */