

// 3. (code) Not Fibbonacci
// this code follows the word instructions of code problem 3
public class Main {

    public static void NotFib(int runtime) {

        int[] sequence = new int[runtime];
        int Fib0 = 0;
        int Fib1 = 1;
        sequence[0] = Fib0;
        sequence[1] = Fib1;

        for(int i = 2; i<runtime;i++){
            sequence[i]= sequence[i-1]*2 + sequence[i-2];
        }
        for(int i = 0; i<sequence.length; i++){
            System.out.println(sequence[i]);
        }
    }
    public static void main(String[]args){
        int RunTime = 10;
        NotFib(RunTime);

    }

}





