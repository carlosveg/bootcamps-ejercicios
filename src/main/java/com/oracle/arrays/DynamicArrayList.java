package com.oracle.arrays;

public interface DynamicArrayList {
    int size = 0;
    void insert(int element);
    void remove(int index);
    void get(int index);
    void resize();
}