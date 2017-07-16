package com.unrealwork.hackerrank.algorithms.sorting.heap;


import java.util.Arrays;
import java.util.Scanner;

public class MinHeap {

  private static final int DEFAULT_CAPACITY = 10;
  private int[] data;
  private int size;
  private int capacity;

  public MinHeap() {
    this.data = new int[DEFAULT_CAPACITY];
    this.capacity = DEFAULT_CAPACITY;
    this.size = 0;
  }

  /**
   * Get minimum element of heap;
   *
   * @return instance of minimum element
   */
  public int peek() {
    if (size == 0) {
      throw new IllegalStateException();
    }
    return data[0];
  }

  /**
   * Extract minimum element
   *
   * @return minimum element
   */
  public int poll() {
    if (size == 0) {
      throw new IllegalStateException();
    }
    int item = data[0];
    data[0] = data[size - 1];
    size--;
    heapifyDown();
    return item;
  }

  public void add(int item) {
    ensureExtraCapacity();
    data[size] = item;
    size++;
    heapifyUp();
  }

  private void heapifyUp() {
    int index = size - 1;
    while (hasParent(index) && parent(index) > data[index]) {

      int parentIndex = parentIndex(index);
      swap(parentIndex, index);
      index = parentIndex;
    }
  }

  private void heapifyDown() {
    int index = 0;
    while (hasLeft(index)) {
      int smallerChildIndex = leftIndex(index);
      if (hasRight(index) && right(index) < left(index)) {
        smallerChildIndex = rightIndex(index);
      }

      if (data[index] < data[smallerChildIndex]) {
        break;
      } else {
        swap(index, smallerChildIndex);
      }
      index = smallerChildIndex;
    }
  }


  private int parentIndex(int index) {
    return (index - 2) / 2;
  }

  private int leftIndex(int index) {
    return index * 2 + 1;
  }

  private int rightIndex(int index) {
    return index * 2 + 1;
  }

  private boolean hasParent(int index) {
    return parentIndex(index) >= 0;
  }

  private boolean hasLeft(int index) {
    return leftIndex(index) < size;
  }

  private boolean hasRight(int index) {
    return rightIndex(index) < size;
  }

  private int parent(int index) {
    return data[parentIndex(index)];
  }

  private int left(int index) {
    return data[leftIndex(index)];
  }

  private int right(int index) {
    return data[rightIndex(index)];
  }

  private void swap(int indexOne, int indexTwo) {
    final int tmp = data[indexOne];
    data[indexOne] = data[indexTwo];
    data[indexTwo] = tmp;
  }

  private void ensureExtraCapacity() {
    if (size == capacity) {
      data = Arrays.copyOf(data, capacity * 2);
      capacity *= 2;
    }
  }

  double median() {
    int middle = size / 2;
    return (size % 2 == 0) ? (data[middle -1] + data[middle]) / 2 : data[middle];
  }

  public static void main(String[] args) {
    MinHeap heap = new MinHeap();
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    for (int a_i = 0; a_i < n; a_i++) {
      heap.add(in.nextInt());
      System.out.println(heap.median());
    }
  }
}
