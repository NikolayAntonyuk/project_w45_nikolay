package kolya.Task3;

public class PrepareTestData2 {
    public void main(String[] args) {

        int[] ArrayList1 = new int[5];

        ArrayList1[0]=1;
        ArrayList1[1]=2;
        ArrayList1[2]=3;
        ArrayList1[3]=4;
        ArrayList1[4]=5;

        for( int i = 0; i < ArrayList1.length; i++){
            System.out.println(ArrayList1[i]);
        }
        System.out.println("Значений - "+ 5);

        int i = 5;
        String ArrayList2 = Integer.toString(i);
        System.out.println(ArrayList2);

        //  assert(ArrayList2 == ArrayList2);
    }
}