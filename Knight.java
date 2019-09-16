package csce247.assignments.observer;
/** Town guard
 * 
 * @author Scott
 *
 */

public class Knight implements Observer {
	private Subject watchman;	//allows knight to observe 1 subject
	
	public Knight (Subject watchman){	//assigns the Subject as an argument from driver
		this.watchman = watchman;
		watchman.registerObserver(this);	//put knight in assignment watchman's array for getting notifications.
	}

//@override
	public void update (int warning){	// Set knihgt's actions based on watchman's alerts tatus
		if (warning == 1){
			System.out.println("Knight: Helps everyone get home safe");
		}else if (warning == 2){
			System.out.println("Knight: Prepares for battle");
		}
	}
}