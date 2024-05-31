//package mysort.sort;
//
//public class SelectionSort<T> extends Sort{
//
//	public <T> void sort(T[] dataList){
//		setData(dataList);
//		selectionSort(sortedData, 0);
//	}
//
//	private void selectionSort(T[] dataList, int start){
//		if(start >= dataList.length-1) return;
//		int min = start;
//		for(int i = start ; i < dataList.length ; i++)
//			if(dataList[min] > dataList[i]) min = i;
//
//		swap(dataList, min, start);
//		selectionSort(dataList, start + 1);
//	}
//}