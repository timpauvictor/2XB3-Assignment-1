import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {

	public static void main(String[] args) {
		testToString();
		testUnion();
	}
	
	public static void testUnion() {
		System.out.println("Entering testUnion...");
		List<String> data = null;
		try {
			data = Files.readAllLines(Paths.get("input.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String[] dataBuilder = data.get(6).split(",");
		Set set = new Set(dataBuilder);
		dataBuilder = data.get(7).split(",");
		Set set2 = new Set(dataBuilder);
		set = set.setUnion(set2);
		if (set.toString().equals(data.get(8))) {
			System.out.println("Test case 1 passed.");
		} else {
			System.out.println("Test case 1 failed.");
			System.out.println("expected " + data.get(8) + " got " + set.toString());
		}
		
		dataBuilder = data.get(9).split(",");
		set = new Set(dataBuilder);
		dataBuilder = data.get(10).split(",");
		set2 = new Set(dataBuilder);
		set = set.setUnion(set2);
		if (set.toString().equals(data.get(11))) {
			System.out.println("Test case 2 passed.");
		} else {
			System.out.println("Test case 2 failed.");
			System.out.println("expected " + data.get(11) + " got " + set.toString());
		}
		
		dataBuilder = data.get(9).split(",");
		set = new Set(dataBuilder);
		dataBuilder = data.get(10).split(",");
		set2 = new Set(dataBuilder);
		set = set.setUnion(set2);
		if (set.toString().equals(data.get(11))) {
			System.out.println("Test case 2 passed.");
		} else {
			System.out.println("Test case 2 failed.");
			System.out.println("expected " + data.get(11) + " got " + set.toString());
		}
		
		dataBuilder = data.get(12).split(",");
		set = new Set(dataBuilder);
		dataBuilder = data.get(13).split(",");
		set2 = new Set(dataBuilder);
		set = set.setUnion(set2);
		if (set.toString().equals(data.get(14))) {
			System.out.println("Test case 3 passed.");
		} else {
			System.out.println("Test case 3 failed.");
			System.out.println("expected " + data.get(14) + " got " + set.toString());
		}
	}
	
	public static void testIntersection() {
		
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
		
		System.out.println("testToString complete.");
	}
}