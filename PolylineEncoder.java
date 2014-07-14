public class PolylineEncoder{


	static public String convertToFives(String string){

		String chunks= "";
		int nextSpace = 31-5; 

		for (int i =31; i>0; i--){
			chunks = chunks + string.charAt(i); 
			if (i == nextSpace){
				chunks = chunks+ " ";
				nextSpace = nextSpace-5;
			}
		} 
		return chunks; 

	}
	

	public static void main(String[] args){


		//Test case with -179.9832104 

		double testPoint = -179.9832104; 

		int testRound = (int) Math.round(testPoint*1e5);

		int leftShift = testRound << 1; 

		String binaryString = Integer.toBinaryString(leftShift);

		System.out.println(binaryString);
		System.out.println(convertToFives(binaryString));

	}
}  