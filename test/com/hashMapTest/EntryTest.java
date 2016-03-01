package com.hashMapTest;

import com.hashMap.Entry;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by vinaysh on 01/03/16 at 12:07 PM.
 */

public class EntryTest {
    @Test
    public void testEntry_should_create_a_new_entry_with_a_null_next_value(){
        Entry<String,Integer> e1= new Entry<>("index",5,null);
        assertEquals(e1.next ,null);
    }

    @Test
    public void test_Entry_should_create_a_new_entry_which_can_remember_its_new_entry(){
        Entry<String,Integer> e1= new Entry<>("index",5,null);
        Entry<String,Integer> e2= new Entry<>("roll",50,e1);
        assertTrue(e2.next.equals(e1));
    }
}
