package com.hashMap;

/**
 * Created by vinaysh on 01/03/16 at 12:02 PM.
 */
public class Entry<K,V> {
    V value;
    K key;
    Entry next;

    public Entry(K key ,V value ,Entry<K,V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}
