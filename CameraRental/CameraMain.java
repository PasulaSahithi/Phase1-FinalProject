package CameraRental;

import java.util.*;
public class CameraMain 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Camera.list.add(new Camera(1,"Samsung","Ds123",500,"Available"));
		Camera.cam_id++;
		Camera.list.add(new Camera(2,"Sony","HD214",500,"Available"));
		Camera.cam_id++;
		Camera.list.add(new Camera(3,"Panasonic","XC",500,"Available"));
		Camera.cam_id++;
		Camera.list.add(new Camera(4,"Canon","XLR",500,"Available"));
		Camera.cam_id++;
		Camera.list.add(new Camera(5,"Fujitsu","J5",500,"Available"));
		Camera.cam_id++;
		Camera.list.add(new Camera(6,"LG","L123",500,"Available"));
		Camera.cam_id++;
		System.out.println("===========================================");
		System.out.println("PROJECT -> CAMERA RENTAL APPLICATION");
		System.out.println("DEVELOPER -> PASULA SAHITHI");
		System.out.println("===========================================");
		System.out.println();
		System.out.println("===========================================");
		System.out.println("WELCOME TO CAMERA RENATAL APP"); 
		System.out.println("===========================================");
		System.out.println("PLEASE LOGIN TO CONTINUE ");
		System.out.print("USERNAME - "); 
		String username=sc.next();
		System.out.print("PASSWORD - ");
		String password=sc.next();
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin@123")){
			Options.options();
		}
		else {
			System.out.println("Invalid user");
		}
	}
	
	}
