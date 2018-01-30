package com.dominos.dpzcodeexercise.Utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pizza Guru
 * Created on 1/30/2018.
 */

public class PizzaLoader {

    public static List<String> getTestData() {
        List<String> names = new ArrayList<>();

        names.add("Honolulu Hawaiian");
        names.add("Buffalo Chicken");
        names.add("Chocolate Lava Crunch Cake");

        return names;
    }
}
