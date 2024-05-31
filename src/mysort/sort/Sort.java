package mysort.sort;

import java.util.Arrays;

public abstract class Sort<T> {
	T[] orgData;
	T[] sortedData;
	
	public abstract void sort(T dataList);
	
	void swap(T[] dataList, int a, int b) {
		if (a == b) return;
		T temp;
		temp = dataList[a];
		dataList[a] = dataList[b];
		dataList[b] = temp;
	}
	
	public void setData(T[] dataList) {
		this.orgData = dataList;
		this.sortedData = dataList.clone();
	}
	
	public String getOrgData() {
		return Arrays.toString(orgData);
	}
	
	public String getSortedData() {
		return Arrays.toString(sortedData);
	}

}
