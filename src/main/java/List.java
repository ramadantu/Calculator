public class List {
    final int MAX_SIZE = 5;
    int[] array = new int[MAX_SIZE];
    int size;

    private int index(int element){

        for(int i = 0; i < size; i++) {
            if (array[i] == element){
                return i;
            }
        }

        return -1;
    }

    public int size() {
        return size;
    }

    public void add(int element) {
        array[size++] = element;
    }

    public void remove(int element) {
        int indexOfElement = index(element);
        array[indexOfElement] = array[size--];
    }

    public int element(int index) {
        return array[index];
    }

}
