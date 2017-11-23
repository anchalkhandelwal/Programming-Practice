package hashtable;

public class HashTableEntry {
	private int key;
	private int value;
	
	HashTableEntry(){ }
	
	HashTableEntry(int key, int value){
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}
	
	public int getValue() {
		return value;
	}

//	public void setValue(int value) {
//		this.value = value;
//	}
//	
//	public void setKey(int key) {
//		this.key = key;
//	}	
}
