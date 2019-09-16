package csce247.assignments.observer;
/** Care taker of children
 * 	A copy of ShopOwner with different actions based on Subjects warnings
 * @author Scott
 *
 */

public class Teacher implements Observer {
	
	private Subject watchman;
	
	public Teacher(Subject watchman){
		this.watchman = watchman;
		watchman.registerObserver(this);
	}

//@override
	public void update (int warning){
		if (warning == 1){
			System.out.println("Teacher: Helps get every kid home safe");
		}else if (warning == 2){
			System.out.println("Teacher: Brings all students to the underground shelter");
		}
	}
}