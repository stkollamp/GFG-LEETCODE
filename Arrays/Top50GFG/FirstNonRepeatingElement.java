/*
* Author: Sai Tharun Kollampally
* Date: 5-5-2022
* Description: Find the first non-repeating element in a given array arr of N integers.
* Note: Array consists of only positive and negative integers and not zero.
* Link: https://practice.geeksforgeeks.org/problems/non-repeating-element3958/1#
*/
class Check{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
       
        if(n==1) return arr[0];
        // Complete the function
        Map<Integer,Integer> map=new HashMap<>();
        for(int i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=0;i<n;i++){
            if(map.get(arr[i])==1){
                return arr[i];
            }
        }
        return 0;
    }  
    
}