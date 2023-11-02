package CameraRental;
import java.util.*;
public class MyCamera 
{
	public static void mycamera() {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.ADD\n"
				+ "2.REMOVE\n"
				+ "3.VIEW MY CAMERAS\n"
				+ "4.GO TO PREVIOUS MENU");
		int opt1=sc.nextInt();
		switch(opt1) {
		case 1:
			//System.out.println("ENTER THE CAMERA ID - ");
			//int camera_id=sc.nextInt();
			System.out.println("ENTER THE CAMERA BRAND - ");
			String brand=sc.next();
			System.out.println("ENTER THE MODEL - ");
			String model=sc.next();
			System.out.println("ENTER THE PER DAY PRICE - ");
			double price=sc.nextInt();
			String status="Available";
			Camera.list.add(new Camera(++Camera.cam_id,brand,model,price,status));
			System.out.println("YOUR CAMERA HAS BEEN SUCCESSFULLY ADDED TO THE LIST\n");
			mycamera();
			break;
		case 2:
			DisplayCamera.displaycamera();
			System.out.print("ENTER THE CAMERA ID TO REMOVE - ");
			int id=sc.nextInt();
			for(int i=0;i<Camera.list.size();i++) {
				if(Camera.list.get(i).camera_id==id) {
					Camera.list.remove(i);
					System.out.println("CAMERA SUCCESSFULLY REMOVED FROM THE LIST\n");
					mycamera();
				}
			}
			System.out.println("INVALID CAMERA ID");
			mycamera();
			break;
		case 3:
			DisplayCamera.displaycamera();
			mycamera();
			break;
		case 4:
			Options.options();
			break;
		default: 
			System.out.println("invaild option\npls try again");
			mycamera();
		}
	}
}
