
// 4. (code) where in sequence
public class Main {

    public static void NotFib(int runtime, int num) {
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
        // new code to find number and where in seq .
        for(int i = 0; i<sequence.length; i++){
            if(sequence[i] == num){
                System.out.println("The Number "+num+" is in the NotFibonacci sequence "+" and is the number " +(i+1)+" entry.");
            }

        }
    }
    public static void main(String[]args){
        int RunTime = 10;
        int numTO_find = 100;
        NotFib(RunTime, numTO_find);
    }
}
