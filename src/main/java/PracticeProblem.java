public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int goodString(String x) {
		int y=-1;
		int z=0;
		for (int i=0;i<x.length();i++) {
			for (int j=0;j+i<x.length()-1;j++) {
				if (x.charAt(i)==x.charAt(x.length()-j-1)) {
					z=j+i;
					if (y>z||y<0) {
						y=z;
					}
				} 
			}
		}
		return y;
	}

}
