import java.util.*;

class PascalTriangle{
    public static void main(String[] args) {
        System.out.println(getRow(4));
    }

    public static List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list = new ArrayList<>(rowIndex + 1);
        list.add(1);
        long prev = 1L;
        for (int i = 1; i <= rowIndex; i++) {
            long next = prev * (rowIndex - i + 1) / i; // long arithmetic -> no overflow here
            list.add((int) next);
            prev = next;
        }
        return list;
    }
}
