package assignment2;

public class LongestMonotoneAscending {
    public static void main(String[] arguments) {
        int [] array = {1,0,0,0,1,0};
       
        System.out.println(lengthOfArray(array));
    }
   
    public static int lengthOfArray(int[] a) {
        //checking # 0s vs # 1s
                int numZeros = 0;
                int numOnes = 0;
                int tempLength = 0, maxLength = 0;
               
                for(int i = 0; i < a.length; i++) {
                    if(a[i] == 0) {
                        numZeros++;
                        //lastZeroIndex = i;
                    }
                    if(a[i] == 1)
                        numOnes++;
                }
       
               
                if (numZeros > numOnes) {
                    int temp = -1;
                    for(int i = 0; i < a.length; i++) {
                        System.out.print("Checking: " + a[i] + " ");
                        if (a[i] >= temp) {
                            tempLength++;
                            if (tempLength > maxLength)
                                maxLength = tempLength;
                        }
                        else {
                            tempLength = 1;
                        }
                        temp = a[i];
                        System.out.println("Max length: " + maxLength + " Temp length: " + tempLength);
                    }
                    return maxLength;
                }
               
        return numOnes;
    }
}
