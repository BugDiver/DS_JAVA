package com.hashMap;

public class MyHashMap<K, V> {
    private int length;
    private Entry[] table;
    private int capacity = 16;

    public MyHashMap() {
        length = 0;
        table = new Entry[capacity];
    }

    public void put(K key, V value) {
        if (key == null || value == null) {
            throw new RuntimeException("can't make null as key or value");
        }
        int hash = hash(key);
        Entry<K, V> newEntry = new Entry<>(key, value, null);
        if (table[hash] == null) {
            table[hash] = newEntry;
        } else {
            newEntry.next =table[hash];
            table[hash] = newEntry;
        }
        length++;
    }

    public V get(K key) {
        int hash = hash(key);
        if (table[hash] == null) {
            return null;
        } else {
            Entry<K,V> temp = table[hash];
            while (temp != null) {
                if (temp.key.equals(key))
                    return temp.value;
                temp = temp.next;
            }
            return null;
        }
    }

    private int hash(K key) {
        return 31 * Math.abs(key.hashCode()) % capacity;
    }

    public int getLength() {
        return this.length;
    }

    public boolean remove(K key) {
        int hash = hash(key);
        if (table[hash] == null) {
            return false;
        } else {
            Entry<K,V> current = table[hash];

            while (current != null) {
                if (current.key.equals(key)) {
                    table[hash] = table[hash].next;
                    length--;
                    return true;
                }
                current = current.next;
            }
            return false;
        }

    }
}
