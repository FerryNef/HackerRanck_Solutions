import java.util.*;

class Result {

   
    public static int pickingNumbers(List<Integer> a) {
    
    int[] frequency = new int[101];
    int max=0;
    
    //to count the frequency of each element of the List a
    for (int i=0; i<a.size(); i++) {
        frequency[a.get(i)]++;
    }
    
    //Iterate through the frequency array to find the longest subarray
    for (int j=0; j<frequency.length-1; j++) {
        int currentLength = frequency[j]+frequency[j+1];
        if (currentLength>max){
            max=currentLength;
        }
    }
    return max;
    

    }

}


