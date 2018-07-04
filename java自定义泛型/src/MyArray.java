public class MyArray<T> {
    private T[] arr;

    public MyArray(T[] arr) {
        this.arr = arr;
    }

    public int len() {
        if (arr == null) {
            return 0;
        } else {
            return arr.length;
        }
    }

    public T get(int i) {
        return arr[i];
    }

    public void set(int i,T k) {
        arr[i] = k;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + " ");
        }
        return sb.toString();
    }
}