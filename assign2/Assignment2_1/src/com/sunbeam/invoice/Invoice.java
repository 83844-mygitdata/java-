//Create a class called Invoice that a hardware store might use to represent an invoice for an item
//sold at the store. An Invoice should include four pieces of information as fields—a part number
//(type String), a part description (type String), a quantity of the item being purchased (type int) and a
//price per item (double). Your class should have a constructor
//that initializes the four instance variables. Provide a set and a get method for each instance variable.
//calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
//amount as a double value.
//If the quantity is not positive, it should be set to 0.
//If the price per item is not positive, it should be set to 0.0.
//Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.


package com.sunbeam.invoice;

public class Invoice {
		private String part_num;
		private String part_desc;
		private int qty;
		private double price;
		
		public Invoice(){
			part_num = "";
			part_desc = "";
			qty = 0;
			price = 0.0;
		}
		
		public Invoice (String part_num, String part_desc, int qty,double value){
			this.part_num = part_num;
			this.part_desc = part_desc;
			this.qty = qty;
			this.price = value;
			
		}

		public String getPart_num() {
			return part_num;
		}

		public void setPart_num(String part_num) {
			this.part_num = part_num;
		}

		public String getPart_desc() {
			return part_desc;
		}

		public void setPart_desc(String part_desc) {
			this.part_desc = part_desc;
		}

		public int getQty() {
			return qty;
		}

		public void setQty(int qty) {
			if(qty<0)
				qty = 0;
			this.qty = qty;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			if(price<0)
				price = 0.0;
			this.price = price;
		}
		
	    

		public double calculateInvoice() {
			return qty*price;
		}
		
		public void displayInvoice() {
			System.out.println("Invoice = "+calculateInvoice());
		}
		
		
		
}
