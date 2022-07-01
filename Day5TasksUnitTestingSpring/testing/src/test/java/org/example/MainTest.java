package org.example;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    ArrayList<String> list = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    @Before
    void setUp() {

        list.add("gineeey");
        list.add("zxc");
        list.add("eqw");
        list.add("asd");
        list.add("blacky");


        list2.add("zxc");
        list2.add("eqw");
        list2.add("asd");
        list2.add("perks");
        list2.add("string");
    }
    @Test
    void evenCheckForEightShouldReturnTrue(){
        assertTrue(Main.evenNumberCheck(8));
    }

    @Test
    void evenCheckForElevenShouldReturnFalse(){
        assertFalse(Main.evenNumberCheck(11));
    }

    @Test
    void removeAllShouldReturnTrue(){
        assertEquals(true, Main.clearCollection(list));
    }
}