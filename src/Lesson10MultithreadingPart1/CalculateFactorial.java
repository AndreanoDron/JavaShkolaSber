package Lesson10MultithreadingPart1;

public class CalculateFactorial {
     static synchronized long factorial(double n){
        long rezultat=1;
        for (long i = 1; i<=n;i++){
            rezultat=rezultat*i;
        }

        return rezultat;
    }

}
