package CameraRental;
import java.lang.String;
import java.util.ArrayList;
import java.util.Scanner;

public class Camera 
{
	static Scanner sc=new Scanner(System.in);
	static double money=1000;
	static int cam_id;
	static ArrayList<Camera> list=new ArrayList<>();
	int camera_id;
	String brand;
	String model;
	double price;
	String status;
	public Camera(int camera_id, String brand, String model, double price, String status) {
		super();
		this.camera_id = camera_id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.status = status;
	}
}
