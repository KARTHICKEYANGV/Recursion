import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Main m1=new Main();
	    ArrayList<Integer> list=new ArrayList<>();
	    int arr[]={1,2,1};
	    int n=arr.length;
	    int ind=0;
	    int sum=0;
	    int t=2;
		m1.printf(ind,list,arr,n,sum,t);
	}
	public boolean printf(int ind,ArrayList<Integer>list,int[]arr,int n,int sum,int t){
	    if(ind==n){
	        if(t==sum){
	        for(int c:list){
	            System.out.print(c+" ");
	            
	        }
	        
	        System.out.println();
	        return true;
	    }
	     else return false;   
	    }
	    list.add(arr[ind]);
	    sum+=arr[ind];
	    if(printf(ind+1,list,arr,n,sum,t)==true) return true;
	    list.remove(list.size()-1);
	    sum-=arr[ind];
	    if(printf(ind+1,list,arr,n,sum,t)==true) return true;
	    return false;
	}
}
