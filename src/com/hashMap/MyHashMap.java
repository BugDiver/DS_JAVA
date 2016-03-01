package com.hashMap;

/**
 * Created by vinaysh on 01/03/16 at 11:59 AM.
 */
public class MyHashMap<K ,V> {
    private Entry[] table;
    private int capacity = 4;

    public MyHashMap(){
        table = new Entry[capacity];
    }

    public void put(K key ,V value){
        if(key == null){
            throw new RuntimeException("can't make null as key");
        }
        int hash=hash(key);
        Entry<K,V> newEntry = new Entry<K,V>(key,value, null);
        table[hash] = newEntry;
    }

    public V get(K key) {
        int hash = hash(key);
        if(table[hash] == null){
            return null;
        }
        Entry<K,V> temp = table[hash];
        return temp.value;
    }

    private int hash(K key){
        return Math.abs(key.hashCode()) % capacity;
    }
}
