package kolya.Task3;

import java.util.ArrayList;

public class PrepareTestData {
    private ArrayList<Integer>arrayList1;

    public ArrayList<Integer> getArrayList1() {
        return arrayList1;
    }

    public ArrayList<String> getArrayList2() {
        return arrayList2;
    }

    private ArrayList<String>arrayList2;

    public void fillArrayInt() {
        arrayList1 = new ArrayList<>();
        for(int a = 1; a < 6; a++) {
            arrayList1.add(a);
        }
    }

    public void fillArrayString() {
        arrayList2 = new ArrayList<>();
        for(int b: arrayList1) {
            arrayList2.add(String.valueOf(b));
        }

    }
}