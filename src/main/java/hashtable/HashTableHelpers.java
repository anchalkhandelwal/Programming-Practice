package hashtable;

public class HashTableHelpers {
	
	HashTableEntry[] hashArray;
	private int arraySize;
	
	HashTableHelpers(int arraySize){
		this.arraySize = arraySize;
		hashArray = new HashTableEntry[this.arraySize];
		
		for(int i = 0 ; i < hashArray.length ; i++){
			hashArray[i] = new HashTableEntry();
		}
	}
	
	public int getHashCode(int key){
		int hashCode = key%arraySize;
		return hashCode;
	}
	
	public void put(int key, int value){
		int index = getHashCode(key);
		HashTableEntry arrayValue = hashArray[index];
		hashArray[index] = new HashTableEntry(key, value);
	}
	
}
