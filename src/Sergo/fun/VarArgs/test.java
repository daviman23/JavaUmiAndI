package Sergo.fun.VarArgs;

public class test {
    public static void main(String[] args) {
        test test = new test();
        long l = test.sumMoreIntr(53345,4535,34535,3453453,3453);
        System.out.println(l);
    }
    public long sumMoreIntr(int ... numbers){
        long sum = 0;

        for (int i = 0; i < numbers.length ; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
}
