package csce247.assignments.observer;
/**Type of town member that runs a shop
 * 
 * @author Scott
 *
 */
public class ShopOwner implements Observer {
	
	private Subject watchman; //allows shopOwner to observe 1 subject
	
	public ShopOwner(Subject watchman){	//assigns the Subject as an argument from driver
		this.watchman = watchman;
		watchman.registerObserver(this);	//put shop owner in assignment watchman's array for getting notifications.
	}

//@override
	public void update (int warning){ 		// Set ShopOwners actions based on alertstatus
		if (warning == 1){
			System.out.println("Shop Owner : Close down shop and head home");
		}else if (warning == 2){
			System.out.println("Shop Owner : Drops everything and find nearest hideout");
		}
	}
}