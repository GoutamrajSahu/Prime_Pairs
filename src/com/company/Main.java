//Question:

//There is a range given a and m in which we have to find the count all the
//prime pairs whose difference is 6. We have to find how many sets are
//there within a given range.
//Output: Output consist of single line, print the count prime pairs in given
//range. Else print "No Prime Pairs".
//
//Sample I/P:
//4
//30
//Sample O/P:
//6

package com.company;
import java.util.*;
class Main {
    static Vector<Integer> getPrimes(int start, int end){
        Vector<Integer> res = new Vector<>();
        for(int i = start; i<=end; i++){
            int count = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter start and end: ");
        int start = Sc.nextInt();
        int end = Sc.nextInt();
        Vector<Integer> primes = new Vector<Integer>();
        int countSits = 0;
        primes = getPrimes(start, end);

//         System.out.println("Prime numbers are:");
//         for(int i: primes){
//             System.out.println(i);
//         }

        for(int i=0; i<primes.size();i++){
            for(int j=i+1; j<primes.size(); j++){
                if(Math.abs(primes.get(i) - primes.get(j)) == 6){
                    countSits++;
                }
            }
        }
        if(countSits>0){
            System.out.println(countSits);
        }else{
            System.out.println("No Prime Pairs");
        }
    }
}