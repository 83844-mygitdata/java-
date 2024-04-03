package com.sunbeam.tester;

import com.sunbeam.invoice.Invoice;

public class InvoiceTestor {

	public static void main(String[] args) {
		Invoice i = new Invoice();
		i.setPart_desc("abccc");
		i.setPart_num("2");
		i.setPrice(500);
		i.setQty(5);
		
		i.displayInvoice();
		

	}

}
