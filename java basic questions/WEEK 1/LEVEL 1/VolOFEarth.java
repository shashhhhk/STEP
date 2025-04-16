class VolOFEarth{
	public static void main(String[] args){
		double radius=6378;
		double volume=(4/3)*3.14*radius;
		double change_miles=volume*0.239913;
		
		System.out.println("The volume of earth in cubic Km is "+volume+" and cubic miles is "+change_miles);
	}
}