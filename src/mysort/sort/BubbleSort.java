//package mysort.sort;
//
//public class BubbleSort<T> extends Sort{
//	public <T> void sort(T[] dataList){
//		setData(dataList);
//		bubbleSort(sortedData, sortedData.length-1);
//	}
//
//	private void bubbleSort(T[] dataList, int last){
//		if(last > 0){
//			for(int i = 1 ; i <= last ; i++){
//				if(dataList[i] < dataList[i-1]) swap(dataList, i, i-1);
//			}
//			bubbleSort(dataList, last - 1);
//		}
//	}
//}