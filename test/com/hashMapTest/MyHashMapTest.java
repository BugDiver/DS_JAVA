package com.hashMapTest;

import com.hashMap.MyHashMap;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vinaysh on 01/03/16 at 12:18 PM.
 */

public class MyHashMapTest {
    @Test
    public void test_MyHashMap_should_not_put_a_key_AS_null(){
        MyHashMap<String ,Integer> list = new MyHashMap<>();
        try{
            list.put(null ,5);
        }catch(RuntimeException e){
            assertEquals(e.getMessage() ,"can't make null as key");
        }
    }

    @Test
    public void test_hashmap_should_put_key_value_pair() throws Exception {
        MyHashMap<String ,Integer> list = new MyHashMap<>();
        list.put("a" ,1);
        assertSame(list.get("a") ,1);
    }
}
