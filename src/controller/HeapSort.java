package controller;

public class HeapSort {
    public void sort(int array[])
    {
        int num = array.length;
 
        for (int i = num / 2 - 1; i >= 0; i--)
            heapify(array, num, i);
 
        for (int i = num - 1; i > 0; i--) {
            int t = array[0];
            array[0] = array[i];
            array[i] = t;
 
            heapify(array, i, 0);
        }
    }
 
    void heapify(int array[], int num, int i)
    {
        int largest = i; 
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 
 
        if (left < num && array[left] > array[largest])
            largest = left;
 
        if (right < num && array[right] > array[largest])
            largest = right;
 
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
 
            heapify(array, num, largest);
        }
    }
    
}