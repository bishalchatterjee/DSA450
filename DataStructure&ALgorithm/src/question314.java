import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class question314 {
    //“k” largest element in an array
    static void kLargest(int[] arr, int n, int k) {
        // code here
        int b[]=new int[k];
        PriorityQueue<Integer> q=new PriorityQueue<Integer>(Comparator.reverseOrder()); //Using Comparator.reverseOrder
        int i;
        for(i=0;i<n;i++)
        {
            q.offer(arr[i]);
        }
//        System.out.println(Arrays.toString(q.toArray())); //Debugger (printing the priority queue)
        for(i=1;i<=k;i++) //printing k largest elements
        {
            b[i-1]=q.poll();
        }
        for(i=0;i<b.length;i++)
            System.out.print(b[i]+" ");
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n= arr.length;
        int k=3;
        kLargest(arr,n,k);
    }
}

/*
Using MinHeap

public static void firstKElements(int arr[], int n, int k)
{
//we compare the min heaps root element and add accordingly
	PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	for(int i = 0; i < k; i++)
	{
		minHeap.add(arr[i]);
	}
	for(int i = k; i < n; i++)
	{
		if (minHeap.peek() > arr[i])
			continue;
		else
		{
			minHeap.poll();
			minHeap.add(arr[i]);
		}
	}

	Iterator iterator = minHeap.iterator();

	while (iterator.hasNext())
	{
		System.out.print(iterator.next() + " ");
	}
}

public static void main (String[] args)
{
	int arr[] = { 1,2,3,4,5,6 };
	int size = arr.length;
	int k = 3;
	firstKElements(arr, size, k);
}
 */
