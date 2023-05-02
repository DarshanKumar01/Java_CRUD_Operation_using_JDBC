package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import dao.TRS;

public class CTRL {
	public static void main(String[] args) throws Exception {

		TRS t = new TRS();
		Scanner sc = new Scanner(System.in);

		boolean f = true;

		while (f) {
			System.out.println("enter the option");
			System.out.println("1.insert\n 2.update\n 3.fetch\n 4.exit\n 5.remove");
			int opt = sc.nextInt();
			switch (opt) {
			case 1: {
				System.out.println("enter the deatiles");

				// System.out.println("enter the id");
				// int id=sc.nextInt();

				System.out.println("enter the name");
				String name = sc.next();

				System.out.println("enter the passowrd");
				String pass = sc.next();

				System.out.println("enter the phone number");
				long phno = sc.nextLong();

				System.out.println("enter the path ");
				FileInputStream fo = new FileInputStream(sc.next());
				byte[] b = new byte[fo.available()];
				fo.read(b);

				t.insert(name, pass, phno, b);

				System.out.println("value inserted from controller");

			}
				break;

			case 2: {
				System.out.println("enter the id to update");
				int id=sc.nextInt();
				System.out.println("enter the name to update");
				String newname=sc.next();
				t.update(id, newname);
				
				System.out.println("name updated from the cntrl");
			}
				break;
				
			case 3:{
				System.out.println("enter the id to fetch info from database");
				
				int id=sc.nextInt();
				t.fetch(id);
				
			}break;
			
			case 5:{
				System.out.println("enter the id to remove the data");
				int id=sc.nextInt();
				t.remove(id);
				
				
			}

			case 4: {
				f = false;
				System.out.println("Terminated.........");

			}
				break;

			default: {
				System.out.println("invalid option entered");
			}
				break;
			}
		}

	}

}
