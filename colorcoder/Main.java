package colorcoder;

public class Main {
	
	 public static void main(String[] args) {
	        Testcode.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
	        Testcode.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
	    
	        Testcode.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
	        Testcode.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
	        
	        System.out.println(ColorService.ToString());
	    }
}
