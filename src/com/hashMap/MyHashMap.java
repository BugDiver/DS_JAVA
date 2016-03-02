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
        int hash = hash(key);
        Entry<K, V> newEntry = new Entry<>(key, value, null);
        addEntry(hash, newEntry);

    }

    private void addEntry(int hash, Entry<K, V> newEntry) {
        if (table[hash] == null) {
            table[hash] = newEntry;
        } else {
            Entry temp = table[hash];
            while (temp != null) {
                if (temp.key == newEntry.key) {
                    temp.value = newEntry.value;
                    return;
                }
                if(temp.next == null) {
                    temp.next = newEntry;
                    return;
                }
                temp = temp.next;
            }
        }
        length++;
    }

    public Object get(K key) {
        int hash = hash(key);
        if (table[hash] == null) {
            return null;
        } else {
            Entry temp = table[hash];
            while (temp != null) {
                if (temp.key == null)
                    return temp.value;
                if (temp.key.equals(key))
                    return temp.value;
                temp = temp.next;
            }
            return null;
        }
    }

    private int hash(K key) {
        if (key == null)
            return 0;
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
            Entry current = table[hash];
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
