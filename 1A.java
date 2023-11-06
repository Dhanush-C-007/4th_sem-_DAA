// Sort a given set of n integer elements using Selection Sort method and compute its time complexity. Run the program for varied values of n> 5000 and record the time taken to sort. Plot a graph of the time taken versus n. The elements can be read from a file or can be generated using the random number generator.  Demonstrate using C++/Java how the brute force method works along with its time complexity analysis: worst case, average case and best case.


public class 1A {  
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int temp = arr[index];   
            arr[index] = arr[i];  
            arr[i] = temp;  
        }  
    }  
       
    public static void main(String a[]){  
        int[] arr1 = {9,14,3,2,43,11,58,22};  
        long start,end;
        System.out.println("Before Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          	start=System.nanoTime();
        selectionSort(arr1);//sorting array using selection sort  
         end=System.nanoTime();
        System.out.println("After Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        	System.out.println("\n\nThe time taken to sort is "+(end-start)+"ns");
    }  
}  
