public class BubbleSorter implements Sorter {
	public void sort(Comparable[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - 1 - i; j++) {
				// 交换位置
				if (data[j].compareTo(data[j + 1]) > 0) {
					Comparable temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
	}
}
