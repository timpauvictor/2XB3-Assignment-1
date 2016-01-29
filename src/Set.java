import java.util.Vector;

public class Set {
	Vector<String> mySet = new Vector<String>();
	
	public Set(String[] data) {
		for (String s : data) {
			this.addElement(s);
		}
	}
	
	public Set() {
		//leave empty
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
	
	public Set setUnion(Set otherSet) {
		Set newSet = new Set();
		for (int i = 0; i < otherSet.getCount(); i++) {
			newSet.addElement(otherSet.getElement(i));
		}
		return newSet;
	}
	
	public Set setIntersection(Set otherSet) {
		Set newSet = new Set();
		
	}
}
