
public class numberofoccurence {
    public static void main(String[] args) {
        int arr[]={23,23,54,65,98,12};
        int count=0,x=23;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println("Count :"+count);   
    }
    }
