//package mysort.sort;
//
//public class QuickSort extends Sort{
//	public void sort(int[] dataList){
//		setData(dataList);
//		quickSort(sortedData, 0, dataList.length-1);
//	}
//
//	private void quickSort(int[] dataList, int start, int end){
//		if(start >= end) return; // base condition
//
//		int part2 = partition(dataList, start, end);
//
//		quickSort(dataList, start, part2-1);
//		quickSort(dataList, part2, end);
//	}
//
//	private int partition(int[] dataList, int start, int end){
//		int pivot = dataList[(start + end) / 2 ];
//
//		while(start <= end){
//			while(dataList[start] < pivot) start ++;
//			while(dataList[end] > pivot) end--;
//
//			if(start <= end) swap(dataList, start++, end--);
//		}
//		return start;
//	}
//}