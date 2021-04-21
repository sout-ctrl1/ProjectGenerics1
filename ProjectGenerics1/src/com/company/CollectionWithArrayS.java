package com.company;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithArrayS <T extends Number>{

        List<? extends Number> myListWithArray = new ArrayList<>();
        private T[] integers2;
        private T[] numbers2;
        private T[] objects2;

        public CollectionWithArrayS(T[] integers2, T[] numbers2, T[] objects2) {
            this.integers2 = integers2;
            this.numbers2 = numbers2;
            this.objects2 = objects2;
        }
}
