package com.hashMapTest;


import org.junit.Test;
import com.hashMap.MyHashMap;

import static org.junit.Assert.*;


public class MyHashMapTest{
    @Test
    public void test_MyHashMap_should_create_a_list_with_0_length(){
        MyHashMap<String ,String> list = new MyHashMap<>();
        assertEquals(list.getLength() ,0);
    }

    @Test
    public void test_MyHashMap_should_put_only_one_key_AS_null(){
        MyHashMap<String ,Integer> list = new MyHashMap<>();
        list.put(null ,5);
        assertEquals(list.getLength() ,1);
        assertEquals((int)list.get(null) ,5);
    }

    @Test
    public void test_MyHashMap_should_override_values_for_null_key(){
        MyHashMap<String ,Integer> list = new MyHashMap<>();
        list.put(null ,5);
        assertEquals(list.getLength() ,1);
        assertEquals((int)list.get(null) ,5);
        list.put(null ,10);
        assertEquals(list.getLength() ,1);
        assertEquals((int)list.get(null) ,10);

    }

    @Test
    public void test_MyHashMap_should_put_value_AS_null(){
        MyHashMap<String ,Integer> list = new MyHashMap<>();
        list.put("foo" , null);
        assertEquals(list.get("foo") ,null);
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
    public void test_hash_should_also_able_to_remove_a_given_key() {
        MyHashMap<String, String> list = new MyHashMap<>();
        list.put("Me", "Vinay");
        list.put("Freind", "Lalit");
        assertEquals(list.getLength(), 2);

        boolean status = list.remove("Freind");
        assertTrue(status);
        assertEquals(list.getLength(), 1);
        assertEquals(list.get("Freind"), null);

    }
}
