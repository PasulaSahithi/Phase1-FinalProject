package CameraRental;
import java.util.*;
public class Options 
{
	public static void options(){
		Scanner sc=new Scanner(System.in);

		System.out.println("1.MY CAMERA \n2.RENT A CAMERA \n3.VIEW ALL CAMERA \n4.MY WALLET \n5.EXIT");
		int option=sc.nextInt();
		switch(option) {
		case 1:
			MyCamera.mycamera();
			break;
		case 2: 
			System.out.println("FOLLOWING IS THE AVAILABLE LIST OF CAMERA(S) - ");
			System.out.printf("%-12s%-15s%-10s%-10s%5s\n","CAMERA ID","BRAND","MODEL","PRICE","STATUS");
			for(int i=0;i<Camera.list.size();i++) {
				Camera c=Camera.list.get(i);
				if(c.status=="Available") {
					System.out.printf("%-12d%-15s%-10s%-10s%5s\n",Camera.list.get(i).camera_id,Camera.list.get(i).brand,Camera.list.get(i).model,Camera.list.get(i).price,
							Camera.list.get(i).status);
				}
			}
			System.out.print("ENTER THE CAMERA ID YOU WANT TO RENT - ");
			int id=sc.nextInt();
			for(int i=0;i<Camera.list.size();i++) {
				if(Camera.list.get(i).camera_id==id) {
					if(Camera.list.get(i).status.contains("Available")) {
						if(Camera.money>=(Camera.list.get(i).price)) {
							Camera.money=Camera.money-(Camera.list.get(i).price);
							System.out.println("YOUR TRANSACTION FOR CAMERA - "+Camera.list.get(i).brand+" with rent INR."+Camera.list.get(i).price+" HAS SUCCESSFULLY COMPLETED\n");
							Camera.list.get(i).status="RENTED";
							options();
						}
						else {
							System.out.println("TRANSACTION FAILED DUE TO INSUFFICIENT WALLET BALANCE.PLEASE DEPOSIT THE AMOUNT TO YOUR WALLET\n");
							options();
						}
					}
					else {
						System.out.println("RENTAL CAMERA IS NOT AVAILABLE\n");
						options();
					}
				}
			}
			System.out.println("INVALID CAMERA ID...");
			options();
			break;
		case 3:
			DisplayCamera.displaycamera();
			options();
			break;
		case 4:
			System.out.println("YOUR CURRENT WALLET BALANCE IS - INR."+Camera.money);
			System.out.println("DO YOU WANT TO DEPOSIT MORE AMOUNT TO YOUR WALLET?(1.YES 2.NO)");
			int dep=sc.nextInt();
			if(dep==1) {
				System.out.print("Enter THE AMOUNT (INR) - ");
				double addmoney=sc.nextDouble();
				System.out.println("YOUR WALLET BALANCE UPDATED SUCCESSFULLY.CURRENT WALLET BALANCE - INR.\n"+(Camera.money+addmoney));
			}
			options();
			break;
		case 5:
			System.out.println("THANKYOU FOR VISITING....");
			break;

		}
	}
}
