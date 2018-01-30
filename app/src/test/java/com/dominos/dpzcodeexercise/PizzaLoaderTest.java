package com.dominos.dpzcodeexercise;

import com.dominos.dpzcodeexercise.utils.PizzaLoader;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Pizza Guru
 * Created on 1/30/2018.
 */

public class PizzaLoaderTest {

    @Test
    public void loadTestData() throws Exception {
        List<String> list = PizzaLoader.getTestData();

        assertEquals(list.get(0), "Honolulu Hawaiian");
    }
}
