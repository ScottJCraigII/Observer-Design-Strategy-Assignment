/** TownDriver.java Assignment
 *  Author: Scott Craig
 *  
 * 	Purpose: to implement the Observer Design Pattern 
 */
package csce247.assignments.observer;

/**Super interface that setups up the minimum methods for Observer/Subject relationsship
 * 
 * @author Scott
 *
 */
public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}