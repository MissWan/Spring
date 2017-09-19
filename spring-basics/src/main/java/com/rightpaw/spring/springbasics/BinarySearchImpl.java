package com.rightpaw.spring.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by alinawxn on 9/18/2017.
 */
@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorith sort;

    public void setSort(SortAlgorith sort) {
        this.sort = sort;
    }

    public int binarySearch(int[] array, int numberToSearch)
    {
        sort.sort(array);
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == numberToSearch)
                return i;
        }
        return -1;
    }
}
