import java.util.Arrays;
import java.util.NoSuchElementException;

public class Dictionary implements Map<String, Integer> {

    private static class Pair {

        private final String key;
        private Integer value;

        private Pair(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{key=" + key + ",value=" + value + "}";
        }
    }

    private final static int INITIAL_CAPACITY = 10;
    private final static int INCREMENT = 5;
    private int count;

    private Pair[] elems;

    public Dictionary() {
        elems = new Pair[INITIAL_CAPACITY];
        count = 0;
    }

    @Override
    public void put(String key, Integer value) {

        // Add an exception check here.

        if(key == null || value == null){
            throw new NullPointerException("key or value is null");
        }

        if (count == elems.length) {
            increaseCapacity();
        }

        elems[count] = new Pair(key, value);
        count++;
    }

    private void increaseCapacity() {

        Pair[] copy;
        copy = new Pair[elems.length + INCREMENT];
        System.arraycopy(elems, 0, copy, 0, count);

        elems = copy;
    }

    @Override
    public boolean contains(String key) {

        // Add an exception check here.

        if(key == null){
            throw new NullPointerException("keu is null");
        }

        boolean found = false;
        int pos = count - 1;

        while (pos >= 0 && !found) {
            if (elems[pos].key.equals(key)) {
                found = true;
            } else {
                pos--;
            }
        }

        return found;
    }

    @Override
    public Integer get(String key) throws NoSuchElementException {

        if(key == null){
            throw new NullPointerException("key is null");
        }

        boolean found = false;
        int pos = count - 1;

        while (pos >= 0 && !found) {
            if (elems[pos].key.equals(key)) {
                found = true;
            } else {
                pos--;
            }
        }

        // Add an exception check here.
        if(found  == false){
            throw new NoSuchElementException("key is not found");
        }

        return elems[pos].value;
    }

    @Override
    public void replace(String key, Integer value) throws NoSuchElementException {

        // Add an exception check here.

        if(key == null || value == null){
            throw new NullPointerException("key or value is null");
        }

        boolean found = false;
        int pos = count - 1;

        while (pos >= 0 && !found) {
            if (elems[pos].key.equals(key)) {
                found = true;
            } else {
                pos--;
            }
        }

        // Add an exception check here.

        if(found == false){
            throw new NoSuchElementException("key is not found");
        }

        elems[pos].value = value;
    }

    @Override
    public Integer remove(String key) throws NoSuchElementException {

        // Add an exception check here.

        if(key == null){
            throw new NullPointerException("key is null");
        }

        boolean found = false;
        int pos = count - 1;

        while (pos >= 0 && !found) {
            if (elems[pos].key.equals(key)) {
                found = true;
            } else {
                pos--;
            }
        }

        // Add an exception check here.
        if(found == false){
            throw new NoSuchElementException("key is not found");
        }

        Integer saved = elems[pos].value;

        while (pos < count - 1) {
            elems[pos] = elems[pos + 1];
            pos++;
        }

        count--;

        elems[count] = null; // scrubbing

        return saved;
    }

    @Override
    public String toString() {
        Pair[] reverse;
        reverse = new Pair[count];
        for (int i = 0; i < count; i++) {
            reverse[i] = elems[count - i - 1];
        }
        return "Dictionary: {elems = " + Arrays.toString(reverse) + "}";
    }

}