package com.company;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithArray<T extends Number> {
    List<? extends Number> myListWithArray = new ArrayList<>();
    private T[] integers1;
    private T[] numbers1;
    private T[] objects1;

    public CollectionWithArray(T[] integers1, T[] numbers1, T[] objects1) {
        this.integers1 = integers1;
        this.numbers1 = numbers1;
        this.objects1 = objects1;
    }
}
