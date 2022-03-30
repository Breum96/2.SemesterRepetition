package hashing.hashsetstudent;

/**
 * This class implements a hash set using separate chaining.
 */
public class HashSetLinearProbing {
	private Object[] buckets;
	private int currentSize;
	private static final String DELETED = "DELETED";
	private final double loadFactor = 0.75;

	/**
	 * Constructs a hash table.
	 *
	 * @param bucketsLength
	 *            the length of the buckets array
	 */
	public HashSetLinearProbing(int bucketsLength) {
		buckets = new Object[bucketsLength];
		currentSize = 0;
	}

	/**
	 * Tests for set membership.
	 *
	 * @param x
	 *            an object
	 * @return true if x is an element of this set
	 */
	public boolean contains(Object x) {
		// Udregner placering af objektet ved hjælp af vore hash funktion.
		int h = hashValue(x);
		Object o = buckets[h];
		// Hvis vores objekt er på den udregnede position returneres true
		//Hvis objekter ikke er på denne position, ved vi der har været en kollision
		if (o != null && o.equals(x)){
			return true;
		}
		// Vi ved der er blevet brugt åben adressering - linear probing.
		//Så nu går vi lineart igennem vores liste indtil vores objekt er fundet, eller vi har været igennem alle elementer.
		int i = h + 1;
		while(i != h){
			if (i >= buckets.length){
				i = 0;
			}
			if (buckets[i] != null && buckets[i].equals(x)){
				return true;
			}
			i++;
		}
		return false;

	}

	/**
	 * Adds an element to this set.
	 *
	 * @param x
	 *            an object
	 * @return true if x is a new object, false if x was already in the set
	 */
	public boolean add(Object x) {
		int h = hashValue(x);
		Object o = buckets[h];
		boolean done = false;
		int i = h;
		while(!done){
			if (i >= buckets.length){
				i = 0;
			}
			if (buckets[i] == null){
				done = true;
				buckets[i] = x;
				currentSize++;
				return true;
			}

			if (buckets[i].equals(x)){
				done = true;
				return false;
			}
			i++;
		}
		throw new ArrayIndexOutOfBoundsException();
	}

	/**
	 * Removes an object from this set.
	 *
	 * @param x
	 *            an object
	 * @return true if x was removed from this set, false if x was not an
	 *         element of this set
	 */
	public boolean remove(Object x) {
		int h = hashValue(x);
		Object o = buckets[h];
		if (o.equals(x)){
			o = null;
			currentSize--;
			return true;
		}

		int i = h + 1;
		while (i != h){

			if (i >= buckets.length){
				i = 0;
			}
			if (buckets[i] == x){
				buckets[i] = null;
				currentSize--;
				return true;
			}
			i++;
		}

		return false;
	}

	/**
	 * Gets the number of elements in this set.
	 *
	 * @return the number of elements
	 */
	public int size() {
		return currentSize;
	}

	private int hashValue(Object x) {
		int h = x.hashCode();
		if (h < 0) {
			h = -h;
		}
		h = h % buckets.length;
		return h;
	}

	// method only for test purpose
	public void writeOut() {
		for (int i = 0; i < buckets.length; i++) {
			System.out.println(i + "\t" + buckets[i]);
		}
	}

}
