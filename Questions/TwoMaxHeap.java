package com.Array;
import java.util.ArrayList;
import java.util.List;

public class TwoMaxHeap {

    public class PowerOfTwoMaxHeap<T extends Comparable<T>> {
        private List<T> heap;
        private int numChildren;

        public PowerOfTwoMaxHeap(int numChildren) {
            if (numChildren <= 0) {
                throw new IllegalArgumentException("Number of children must be greater than zero");
            }
            this.numChildren = numChildren;
            this.heap = new ArrayList<>();
        }

        public void insert(T value) {
            heap.add(value);
            heapifyUp(heap.size() - 1);
        }

        public T popMax() {
            if (heap.isEmpty()) {
                throw new IllegalStateException("Heap is empty");
            }
            T max = heap.get(0);
            int lastIndex = heap.size() - 1;
            heap.set(0, heap.get(lastIndex));
            heap.remove(lastIndex);
            heapifyDown(0);
            return max;
        }

        private void heapifyUp(int index) {
            int parentIndex = (index - 1) / numChildren;
            while (index > 0 && heap.get(index).compareTo(heap.get(parentIndex)) > 0) {
                swap(index, parentIndex);
                index = parentIndex;
                parentIndex = (index - 1) / numChildren;
            }
        }

        private void heapifyDown(int index) {
            int maxIndex = index;
            int startIndex = numChildren * index + 1;
            int endIndex = Math.min(startIndex + numChildren, heap.size());
            for (int i = startIndex; i < endIndex; i++) {
                if (heap.get(i).compareTo(heap.get(maxIndex)) > 0) {
                    maxIndex = i;
                }
            }
            if (maxIndex != index) {
                swap(index, maxIndex);
                heapifyDown(maxIndex);
            }
        }

        private void swap(int i, int j) {
            T temp = heap.get(i);
            heap.set(i, heap.get(j));
            heap.set(j, temp);
        }
    }

}
