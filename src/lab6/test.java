package lab6;


public class test {
    public static void main(String[] args) {
        HashTable table = new HashTable(6);
        System.out.println(table.put(123, "a")); //TRUE
        System.out.println(table.put(2345, "b")); //TRUE
        System.out.println(table.put(567, "c")); //TRUE
        System.out.println(table.put(678, "d")); //TRUE
        System.out.println(table.put(678, "e")); //TRUE
        System.out.println(table.put(3, "f")); //TRUE
        System.out.println(table.put(45, "g")); //FALSE No more space
        System.out.println(table.getValue(567));
        table.print();


    }
}