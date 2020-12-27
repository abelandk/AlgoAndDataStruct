package datastructures.array;

public class DynamicArray {

	int len;
	int capacity;
	int array[];

	public DynamicArray() {

		this(4);
	}

	private DynamicArray(int capacity) {

		len = 0;
		this.capacity = capacity;
		array = new int[capacity];
	}

	public void add(int el) {

		if(len >= capacity) {

			doubleCapacity();
		}

		array[len] = el;
		len++;
	}

	/**
	 * Remove an element
	 * @param el the element to remove
	 */
	public void remove(int el) {

		int index = -1;
		for(int i = 0; i < len; i++) {

			if(array[i] == el) {

				index = i;
				break;
			}
		}

		if(index == -1) return;
		for(int i = index; i < len - 1; i++) {

			array[i] = array[i + 1];
		}

		array[len - 1] = 0;
		len--;
	}

	public int get(int index) {

		if(index < len) return array[index];

		throw new ArrayIndexOutOfBoundsException();
	}

	private void doubleCapacity() {

		int[] temp = array;
		array = new int[capacity*2];
		for(int i = 0; i < capacity; i++) {

			array[i] = temp[i];
		}
	}

	public int size() {

		return len;
	}

	public boolean empty() {

		return len == 0;
	}
} 