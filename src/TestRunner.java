import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {

	public static void main(String[] args) {
		testToString();
	}
	
	public static void testUnion() {
		System.out.println("Entering testUnion...");
	}
	
	public static void testIntersection() {
		System.out.println("Entering testIntersection...");
	}
	
	public static void testDifference() {
		System.out.println("Entering testDifference...");
	}
	
	public static void testProduct() {
		System.out.println("Entering testProduct...");
	}
	
	public static void testIsEqual() {
		System.out.println("Entering testIsEqual...");
	}
	
	public static void testIsSubset() {
		System.out.println("Entering testIsSubset...");
	}
	
	public static void testGetCount() {
		System.out.println("Entering testGetCount...");
	}
	
	public static void testGetCardinality() {
		System.out.println("Entering testGetCardinality...");
	}
	
	public static void testToString() {
		List<String> data = null;
		System.out.println("Entering testToString...");
		try {
			data = Files.readAllLines(Paths.get("input.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String[] dataBuilder = data.get(0).split(",");
		Set set = new Set(dataBuilder);
		if (set.toString().equals(data.get(1))) {
			System.out.println("Test case 1 passed.");
		} else {
			System.out.println("Test case 1 failed.");
		}
		
		dataBuilder = data.get(2).split(",");
		set = new Set(dataBuilder);
		if (set.toString().equals(data.get(3))) {
			System.out.println("Test case 2 passed.");
		} else {
			System.out.println("Test case 2 failed.");
		}
		
		dataBuilder = data.get(4).split(",");
		set = new Set(dataBuilder);
		if (set.toString().equals(data.get(5))) {
			System.out.println("Test case 3 passed.");
		} else {
			System.out.println("Test case 3 failed.");
		}
	}
}