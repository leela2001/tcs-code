//https://youtu.be/iCrQG_kbuP0?si=Sjv7XoLUzHG6wZZS
// Initial Template for Java

import java.io.*;
import java.util.*;


// User function Template for Java
class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
        int allXOR = 0;
        for(int i = 0; i <= n; i++)
        {
            allXOR = allXOR ^ i;
        }
        for(int num: arr)
        {
            allXOR = allXOR^num;
        }
        
        return allXOR;
    }
}
