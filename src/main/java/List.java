public class List {
    final int MAX_SIZE = 5;
    double[] array = new double[MAX_SIZE];
    int size;

    private int index(double element) {

        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }

        return -1;
    }

    public int size() {
        return size;
    }

    public void add(double element) {
        array[size++] = element;
    }

    public void remove(double element) {
        int indexOfElement = index(element);
        array[indexOfElement] = array[size--];
    }

    public double element(int index) {
        return array[index];
    }

}
