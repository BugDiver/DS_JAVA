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
    public void test_hash_map_should_put_key_value_pair() throws Exception {
        MyHashMap<String ,Integer> list = new MyHashMap<>();
        list.put("a" ,1);
        assertSame(list.get("a") ,1);
    }

    @Test
    public void test_hash_map_should_override_the_values_for_same_keys(){
        MyHashMap<String, String> hm = new MyHashMap<>();
        hm.put("name","jarvis");
        assertEquals(hm.get("name") ,"jarvis");
        hm.put("name","Optimus Prime");
        assertNotEquals(hm.get("name") ,"jarvis");
        assertEquals(hm.get("name") ,"Optimus Prime");
    }

    @Test
    public void test_hash_map_should_tell_the_no_of_pairs_it_has_been_added(){
        MyHashMap<String, String> hm = new MyHashMap<>();
        hm.put("a","Apple");
        hm.put("b","Banana");
        hm.put("c","Cherry");
        hm.put("d","Date");
        hm.put("e","Elderberry");
        hm.put("f","Fig");
        hm.put("g","Grape");
        hm.put("h","Honeydew melon");

        assertEquals(hm.getLength() ,8);
    }

    @Test
    public void test_hash_map_should_put_any_number_of_key_value_pair(){
        MyHashMap<String, Integer> list = new MyHashMap<>();
        list.put("a",2);
        list.put("b",3);
        list.put("c",4);
        list.put("d",5);
        list.put("e",6);
        list.put("f",7);
        list.put("g",8);
        list.put("h",9);
        list.put("i",10);

    }
}
