
public class NewSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {8,4,-3,0,3,12};
		int n=a.length;
		
		for(int i=0 ; i<n-1 ; i++) {
			
			int minIndex=i;
			for(int j=i ; j<n ;j++) {
				
				if(a[j]<a[minIndex])
					minIndex=j;
			}
			int temp=a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
		}
		for(int item : a) {
			System.out.print(item +" ");
		}
			

	}

}
