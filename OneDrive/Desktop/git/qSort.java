import java.util.*;


public class qSort {
     static void swap(int [] arr,int i,int j){
        int k;
        k=arr[i];
        arr[i]=arr[j];
        arr[j]=k;
     }
    
    static int partition(int[]arr,int l,int r){
        int p=arr[r];
        int i=l-1;
        for(int j=l;j<r;++j){
            if(arr[j]<p){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,r);
        return i+1;
    }
    static void quick(int arr[],int l,int r){
       if(l<r){ 
        int p;
        p=partition(arr,l,r);
        quick(arr,l,p-1);
        quick(arr,p+1,r);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size Of Array Element :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter All Element One By One : ");
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        System.out.println("before Sorting:");
        for(int i=0;i<n;++i){
            System.out.print(" "+arr[i]);
        }
        quick(arr,0,(n-1));
        System.out.println("After Sorting:");
        for(int i=0;i<n;++i){
            System.out.print(" "+arr[i]);
        }
    }
}
