class DynamicArray {
    int[] array;
    int lastFreeIndex = 0;

    public DynamicArray(int capacity) {
        this.array = new int[capacity];
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if (lastFreeIndex == array.length) {
            resize();
        }
        array[lastFreeIndex] = n;
        lastFreeIndex++;

    }

    public int popback() {
        lastFreeIndex--;
        return array[lastFreeIndex];
    }

    private void resize() {
        int size = 2 * array.length;
        int[] newArray = new int[size];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int getSize() {
        return lastFreeIndex;
    }

    public int getCapacity() {
        return array != null ? array.length : 0;
    }
}
