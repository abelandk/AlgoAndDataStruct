package datastructures.array;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DynamicArrayTest {

	DynamicArray arr;

	@BeforeEach
	void setUp() {

		arr = new DynamicArray();
	}

	@Test
	void addTest() {

		arr.add(1);
		arr.add(2);

		assertEquals(arr.get(0), 1);
		assertEquals(arr.get(1), 2);
		assertEquals(arr.size(), 2);
	}

	@Test
	void doubleSizeTest() {

		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);

		assertEquals(arr.get(0), 1);
		assertEquals(arr.get(4), 5);
		assertEquals(arr.size(), 5);
	}

	@Test
	void removeTest() {

		arr.add(1);
		arr.add(2);
		arr.add(3);

		assertEquals(arr.get(0), 1);
		assertEquals(arr.get(1), 2);
		assertEquals(arr.get(2), 3);
		assertEquals(arr.size(), 3);

		arr.remove(2);
		assertEquals(arr.get(0), 1);
		assertEquals(arr.get(1), 3);
		assertEquals(arr.size(), 2);
	}

} 