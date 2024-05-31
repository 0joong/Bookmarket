//package mysort.sort;
//
//public class MergeSort extends Sort{
//	public void sort(int[] dataList){
//		setData(dataList);
//		mergeSort(sortedData, 0, dataList.length-1);
//	}
//
//	private void mergeSort(int[] dataList, int start, int end){
//		if(start >= end) return;
//		int mid = (start + end) / 2;
//
//		mergeSort(dataList, start, mid);
//		mergeSort(dataList, mid + 1, end);
//		merge(dataList, start, mid, end);
//	}
//
//	private void merge(int[] dataList, int start, int mid, int end){
//		int[] tempList = new int[end-start + 1];
//		int i = start;
//		int j = mid + 1;
//		int k = 0;
//
//		while(i <= mid && j <= end){
//			if(dataList[i] < dataList[j]) tempList[k++] = dataList[i++];
//			else tempList[k++] = dataList[j++];
//		}
//
//		while(i <= mid) tempList[k++] = dataList[i++];
//		while(j <= end) tempList[k++] = dataList[j++];
//
//		System.arraycopy(tempList, 0, dataList, start, end - start + 1);
//	}
//}