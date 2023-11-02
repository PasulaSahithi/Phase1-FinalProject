package CameraRental;

public class DisplayCamera 
{
	static void displaycamera() 
	{
		System.out.printf("%-12s%-15s%-10s%-10s%5s\n","CAMERA ID","BRAND","MODEL","PRICE","STATUS");
		for(int i=0;i<Camera.list.size();i++) {
			System.out.printf("%-12d%-15s%-10s%-10s%5s\n",Camera.list.get(i).camera_id,Camera.list.get(i).brand,Camera.list.get(i).model,Camera.list.get(i).price,
					Camera.list.get(i).status);
		}
		System.out.println();
}
}