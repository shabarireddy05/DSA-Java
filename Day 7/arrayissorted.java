public class arrayissorted {
   
    public static void main(String[] args){
        int arr[]={2,9,5,6,7};
        
            
            for(int i=1; i<arr.length; i++){
                if(arr[i-1] > arr[i]) // Any unsorted pair found
                  System.out.println(false); 
              }
                System.out.println(true); // No unsorted pair found
            }
        }
    


