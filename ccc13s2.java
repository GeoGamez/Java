import java.io.*;
import java.util.*;


class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int W = sc.nextInt();  //total weight
    int N = sc.nextInt();  //total cart
    int[] Car = new int[N];
    for (int i=0; i<N; i++) {
      Car[i] = sc.nextInt();
    }

    int sum = 0;
    
    //if i<4 simply add the sum
    for (int i=0; i<N; i++) {  
         if (i<4) {
          sum+=Car[i];
         } else {
           sum+=Car[i]-Car[i-4];   //add current one and remove the 4 position one 
         }
         if (sum>W) {
            System.out.println(i);
            return;
         }
         
    }
    System.out.println(N);
          
  
  }
}
v 