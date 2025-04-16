class discount{
	public static void main(String[] args){
		double fee=125000,discountpercent=0.1;
		
		double Discount=fee*discountpercent;
		
		double final_fee=fee-Discount;
		
		System.out.println("The dicount amount is INR "+Discount+" and the final discounted fee is INR "+final_fee);
	}
}