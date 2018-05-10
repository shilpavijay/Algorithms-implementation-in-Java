import java.lang.*

public class mergesort {

    private int[] array;
    private int length;

    public void sort(int array[]) {
        this.array = array;
        this.length = array.length;

        for (int i=0;i<this.array.length;i++){
            System.out.println(array[i]);
        }

        if (this.length > 1){
            int pointer = Math.floor(this.length/2);
            int A = this.array[]


//            pointer = math.floor(n/2)
//            A = l[:pointer]
//            B = l[pointer:]
//            mergesort(A)
//            mergesort(B)
//            merge(A,B,l)
        }
    }
    public static void main(String[] args){
        int[] array = {3,2,12,34,23,88};
        mergesort mrgsrt = new mergesort();
        mrgsrt.sort(array);
    }

}