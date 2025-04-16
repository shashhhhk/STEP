class Profit{
	public static void main(String[] args){
		double cost=129,sell=191;
		double profit=sell-cost;
		
		double percent=(profit/cost)*100;
		
		System.out.println("The Cost Price is INR "+cost+" and selling price is INR "+sell+
		"\nThe profit is INR "+profit+" and the profit percentage is "+percent+"%");
	}
}