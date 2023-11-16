package lab6;

public class HashEntry<T, G> {
    T key;
    G value;

    public HashEntry(T key, G value) {
        this.key = key;
        this.value = value;
    }

}