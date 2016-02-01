import java.util.Vector;

public class Set {
	private Vector<String> mySet = new Vector<String>();
	
	public Set(String[] data) {
		for (String s : data) {
			this.addElement(s);
		}
	}
	
	public Set() {
		//just make a new empty set
	}
	
	public boolean contains(String element) {
		return this.mySet.contains(element);
	}
	
	public String getElement(int index) {
		return this.mySet.elementAt(index);
	}
	
	public int getCount() {
		return this.mySet.size();
	}
	
	public void addElement(String element) {
		this.mySet.add(element);
	}
	
	public int getCardinality() {
		Set mySetNoDupes = this.removeDupes();
		return mySetNoDupes.getCount();
	}
	
	public boolean isEqual(Set otherSet) {
		String currentElement = "";
		Set mySetNoDupes = this.removeDupes();
		Set otherSetNoDupes = otherSet.removeDupes();
		
		for (int i = 0; i < mySetNoDupes.getCount(); i++) {
			currentElement = mySetNoDupes.getElement(i);
			if (!otherSetNoDupes.contains(currentElement)) {
				return false;
			}
		}
		return true;
	}
	
	public String toString() {
		String setAsString = "{";
		for (int i = 0; i < this.getCount(); i++ ) {
			setAsString += this.getElement(i) + ",";
		}
		setAsString += "}";
		return setAsString;
	}
	
	public boolean isSubset(Set otherSet) {
		//edge cases
		if (this.getCount() == 0 && otherSet.getCount() == 0) {
			return true; //an empty set equals an empty set
		} else if (this.getCount() == 0 && otherSet.getCount() != 0) {
			return false;
		} else if (this.getCount() != 0 && otherSet.getCount() == 0) {
			return false;
		}
		//regular cases
		String currentElement = "";
		Set mySetNoDupes = this.removeDupes();
		Set otherSetNoDupes = otherSet.removeDupes();
		
		for (int i = 0; i < mySetNoDupes.getCount(); i++) {
			currentElement = mySetNoDupes.getElement(i);
			if (!otherSetNoDupes.contains(currentElement)) {
				return false;
			}
		}
		return true;
	}
	
	public Set setUnion(Set otherSet) {
		Set newSet = new Set();
		Set mySetNoDupes = this.removeDupes();
		Set otherSetNoDupes = otherSet.removeDupes();
		for (int i = 0; i < otherSetNoDupes.getCount(); i++) { //iterate through set
			newSet.addElement(otherSetNoDupes.getElement(i)); // add element
		}
		for (int i = 0; i < mySetNoDupes.getCount(); i++) {
			newSet.addElement(otherSetNoDupes.getElement(i)); 
		}
		return newSet; //return new set
	}
	
	public Set removeDupes() {
		Set newSet = new Set();
		String currentElement = "";
		for (int i = 0; i < this.getCount(); i++) { //iterate through set
			currentElement = this.getElement(i);
			if (!newSet.contains(currentElement)) { //if the newSet doesn't contain our current element
				newSet.addElement(currentElement); //add it 
			} else {
				//do nothing
			}
		}
		return newSet;
	}
	
	public Set setIntersection(Set otherSet) {
		//edge cases
		if (otherSet.getCount() == 0) {
			return this;
		} else if (this.getCount() == 0) {
			return otherSet;
		}
		//regular cases
		String currentElement = "";
		Set newSet = new Set();
		Set mySetNoDupes = this.removeDupes(); 
		Set otherSetNoDupes = otherSet.removeDupes();
		for (int i = 0; i < mySetNoDupes.getCount(); i++) { //iterate through set
			currentElement = mySetNoDupes.getElement(i); //get element 
			if (otherSetNoDupes.contains(currentElement)) { //check if other set contains it
				newSet.addElement(currentElement); //add it to newSet if it does
			}
		}
		return newSet;
	}
	
	public Set setDifference(Set otherSet) {
		//edge cases
		if (otherSet.getCount() == 0) {
			return this;
		} else if (this.getCount() == 0) {
			return otherSet;
		}
		//regular cases
		String currentElement = "";
		Set newSet = new Set();
		Set mySetNoDupes = this.removeDupes(); 
		Set otherSetNoDupes = otherSet.removeDupes();
		for (int i = 0; i < mySetNoDupes.getCount(); i++) { //iterate through set
			currentElement = mySetNoDupes.getElement(i); //get element 
			if (!otherSetNoDupes.contains(currentElement)) { //check if other set doesn't contain it
				newSet.addElement(currentElement); //add it to newSet if it does
			}
		}
		return newSet;
	}
	
	public Set setProduct(Set otherSet) {
		//edge cases
		if (otherSet.getCount() == 0) {
			return this;
		} else if (this.getCount() == 0) {
			return otherSet;
		}
		//regular cases
		Set newSet = new Set();
		Set mySetNoDupes = this.removeDupes();
		Set otherSetNoDupes = otherSet.removeDupes();
		for (int i = 0; i < mySetNoDupes.getCount(); i++) {
			for (int j = 0; j < otherSetNoDupes.getCount(); i++) {
				newSet.addElement("<" + mySetNoDupes.getElement(i) + "," + otherSetNoDupes.getElement(j) + ">");
			}
		}
		return newSet;
	}
}
