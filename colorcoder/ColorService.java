package colorcoder;

public class ColorService {

	 public static ColorPair GetColorFromPairNumber(int pairNumber) {
	        int zeroBasedPairNumber = pairNumber - 1;
	        MajorColor majorColor = 
	            (MajorColor)fromIndex(MajorColor.values(), zeroBasedPairNumber / ColorPair.numberOfMinorColors);
	        MinorColor minorColor =
	            (MinorColor)fromIndex(MinorColor.values(), zeroBasedPairNumber % ColorPair.numberOfMinorColors);
	        return new ColorPair(majorColor, minorColor);
	    }
	 public static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
	        return major.getIndex() * ColorPair.numberOfMinorColors + minor.getIndex() + 1;
	    }
	 
	 public static IColor fromIndex(Object[] colors, int index) {
	        for(Object obj: colors) {
	        	IColor color = (IColor)obj;
	            if(color.getIndex() == index) {
	                return color;
	            }
	        }
	        return null;
	    }
	
	 static String ToString() {
		 String manual_string = "Number" + " " + "Major" + " " + "Minor" + "\n";
		 int total_pair = ColorPair.numberOfMajorColors * ColorPair.numberOfMinorColors;
		 for(int pair_number = 1; pair_number <= total_pair; pair_number++) {
			 ColorPair color_number_combination = GetColorFromPairNumber(pair_number);
			 manual_string += "  " + pair_number + " : " + color_number_combination.ToString();
		 }
		 
		 //System.out.println(manual_string);
		 return manual_string;
		 
	 }

	 
}
