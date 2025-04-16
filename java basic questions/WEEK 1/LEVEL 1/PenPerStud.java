class PenPerStud{
	public static void main(String[] args){
		int total_pen=14;
		int Tobedivided=3;
		int leftout=total_pen % Tobedivided;
		int each=(total_pen)/Tobedivided;
		
		System.out.println("The Pen Per Student is "+each+" and the remaining pen not distributed is "+leftout);
	}
}