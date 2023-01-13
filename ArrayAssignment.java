package cogent.day3;

public class ArrayAssignment {

	public static void main(String[] args) {
		Product products[]=new Product[5];
		
		Product pr1 = new Product();

		pr1.setpID(1001);
		pr1.setpName("Chair");
		pr1.setpPrice(100);
		
		Product pr2 = new Product();
		pr2.setpID(1002);
		pr2.setpName("table");
		pr2.setpPrice(100);
		
		Product pr3 = new Product();
		pr3.setpID(1003);
		pr3.setpName("glass");
		pr3.setpPrice(100);
		
		Product pr4 = new Product();
		pr4.setpID(1004);
		pr4.setpName("set");
		pr4.setpPrice(100);
		
		Product pr5 = new Product();
		pr5.setpID(1005);
		pr5.setpName("Stove");
		pr5.setpPrice(100);
		
		products[0]=pr1;
		products[1]=pr2;
		products[2]=pr3;
		products[3]=pr4;
		products[4]=pr5;
		
		for(Product pr:products ) {
			System.out.println("Product number is: "+pr.getpID());
			System.out.println("Product name is: "+pr.getpName());
			System.out.println(("Product price is: "+pr.getpPrice()));
		}
		
	  	
			
	
		
		
		
		


	}

}
