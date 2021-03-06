/*
	@author
	Aakash.Verma

	Problem: Given an array, find an array of Greater Elements (NGE) for every element.
			 The Next Greater Element for an element x is the first greater element 
			 on the right side of x in array. Elements for which no greater element exist, 
			 consider next greater element as -1.
*/

import java.util.*; 

class NGER {

	public static ArrayList<Integer> nextGreaterElementToRight(int arr[], int n) {
		ArrayList<Integer> v = new ArrayList<>();
		Stack<Integer> s = new Stack<>();

		for(int i = n - 1; i >= 0; i--) {
		    while(!s.empty() && s.peek() < arr[i]) {
    			s.pop();
    		}
    		if(s.empty()) {
    		    v.add(-1);
    		}
    		else  {
    		    v.add(s.peek());
    		}
    		s.push(arr[i]);
		}
		Collections.reverse(v);
		return v;
	}

	public static void main(String[] args) {
		
		int arr[] = {7, 8, 1, 4}; 
		ArrayList<Integer> ans = nextGreaterElementToRight(arr, arr.length); 
		System.out.println(ans.toString());

	}
}