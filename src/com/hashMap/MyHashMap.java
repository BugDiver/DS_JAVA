package com.hashMap;

/**
 * Created by vinaysh on 01/03/16 at 11:59 AM at 2:04 PM.
 */

public class MyHashMap<K ,V> {
    private int length;
    private Entry[] table;
    private int capacity = 16;

    public MyHashMap(){
        length = 0;
        table = new Entry[capacity];

    }

    public void put(K key ,V value){
        if(key == null){
            throw new RuntimeException("can't make null as key");
        }
        int hash=hash(key);
        Entry<K,V> newEntry = new Entry<>(key, value, null);
        if(table[hash] == null){
            table[hash] = newEntry;
        }else{
            Entry<K,V> previous = null;
            Entry<K,V> current = table[hash];

            while(current != null){
                if(current.key.equals(key)){
                    if(previous==null){
                        newEntry.next=current.next;
                        table[hash]=newEntry;
                        return;
                    }
                    else{
                        newEntry.next=current.next;
                        previous.next=newEntry;
                        return;
                    }
                }
                previous=current;
                current = current.next;
            }
            previous.next = newEntry;
        }
        length++;
    }

    public V get(K key) {
        int hash = hash(key);
        if(table[hash] == null){
            return null;
        }else{
            Entry<K,V> temp = table[hash];
            while(temp!= null){
                if(temp.key.equals(key))
                    return temp.value;
                temp = temp.next;
            }
            return null;
        }
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public int getLength() {
        return this.length;
    }
}
