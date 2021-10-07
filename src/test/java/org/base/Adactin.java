package org.base;

import java.io.IOException;

public class Adactin {
	public static void main(String[] args) throws IOException {
		Methods m = new Methods();
		m.setDriver();
		m.launch("https://adactinhotelapp.com/index.php");
		m.maximize();
		String user1 = m.excelread("C:\\Users\\solo\\Documents\\adact.xlsx", "adact", 0, 0, "dd-MMM-yy");
		m.sendkeys("//input[@id='username']", user1);
		String pass1 = m.excelread("C:\\Users\\solo\\Documents\\adact.xlsx", "adact", 0, 1, "dd-MMM-yy");
		m.sendkeys("//input[@id='password']", pass1);
		m.click("//input[@id='login']");
		String loc = m.excelread("C:\\Users\\solo\\Documents\\adact.xlsx", "adact", 0, 7, "dd-MMM-yy");
		int loci = Integer.parseInt(loc);
		m.selectbyindex("//select[@id='location']", loci);
		String hot = m.excelread("C:\\Users\\solo\\Documents\\adact.xlsx", "adact", 0, 8, "dd-MMM-yy");
		int hoti = Integer.parseInt(hot);
		m.selectbyindex("//select[@id='hotels']", hoti);
		String rt = m.excelread("C:\\Users\\solo\\Documents\\adact.xlsx", "adact", 0, 9, "dd-MMM-yy");
		int rti = Integer.parseInt(rt);
		m.selectbyindex("//select[@id='room_type']", rti);
		String rn = m.excelread("C:\\Users\\solo\\Documents\\adact.xlsx", "adact", 0, 10, "dd-MMM-yy");
		int rni = Integer.parseInt(rn);
		m.selectbyindex("//select[@id='room_nos']", rni);
		String ar = m.excelread("C:\\Users\\solo\\Documents\\adact.xlsx", "adact", 0, 11, "dd-MMM-yy");
		int ari = Integer.parseInt(ar);
		m.selectbyindex("//select[@id='adult_room']", ari);
		String cr = m.excelread("C:\\Users\\solo\\Documents\\adact.xlsx", "adact", 0, 12, "dd-MMM-yy");
		int cri = Integer.parseInt(cr);
		m.selectbyindex("//select[@id='child_room']", cri);
		m.click("//input[@id='Submit']");
		m.click("//input[@id='radiobutton_0']");
		m.click("//input[@id='continue']");
		String fn = m.excelread("C:\\Users\\solo\\Documents\\adact.xlsx", "adact", 0, 2, "dd-MMM-yy");
		m.sendkeys("//input[@id='first_name']", fn);
		String ln = m.excelread("C:\\Users\\solo\\Documents\\adact.xlsx", "adact", 0, 3, "dd-MMM-yy");
		m.sendkeys("//input[@id='last_name']", ln);
		String add = m.excelread("C:\\Users\\solo\\Documents\\adact.xlsx", "adact", 0, 4, "dd-MMM-yy");
		m.sendkeys("//textarea[@id='address']", add);
		String ccnum = m.excelread("C:\\Users\\solo\\Documents\\adact.xlsx", "adact", 0, 5, "dd-MMM-yy");
		m.sendkeys("//input[@id='cc_num']", ccnum);
		String cct = m.excelread("C:\\Users\\solo\\Documents\\adact.xlsx", "adact", 0, 13, "dd-MMM-yy");
		int ccti = Integer.parseInt(cct);
		m.selectbyindex("//select[@id='cc_type']", ccti);
		String month = m.excelread("C:\\Users\\solo\\Documents\\adact.xlsx", "adact", 0, 14, "dd-MMM-yy");
		int monthi = Integer.parseInt(month);
		m.selectbyindex("//select[@id='cc_exp_month']", monthi);
		String year = m.excelread("C:\\Users\\solo\\Documents\\adact.xlsx", "adact", 0, 15, "dd-MMM-yy");
		int yeari = Integer.parseInt(year);
		m.selectbyindex("//select[@id='cc_exp_year']", yeari);	
		String cvv = m.excelread("C:\\Users\\solo\\Documents\\adact.xlsx", "adact", 0, 6, "dd-MMM-yy");
		m.sendkeys("//input[@id='cc_cvv']", cvv);
		m.click("//a[contains(text(),'Logout')]");
		m.click("//a[contains(text(),'Click here to login again')]");
		m.click("//input[@id='book_now']");
	}
}
