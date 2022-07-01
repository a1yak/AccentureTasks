package org.example;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void evenCheckForEightShouldReturnTrue() {
        assertTrue(Main.evenNumberCheck(8));
    }

    @Test
    void checkIfListIsReversedShouldReturnTrue() {
        ArrayList<String> list = new ArrayList<>();
        list.add("gineeey");
        list.add("zxc");
        list.add("eqw");
        list.add("asd");
        list.add("blacky");
        assertEquals(true, Main.reverseList(list));
        asse
    }

    @Test
    void evenCheckForElevenShouldReturnFalse() {
        assertFalse(Main.evenNumberCheck(11));
    }
}
