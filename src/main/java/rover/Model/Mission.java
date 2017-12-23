// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package rover.Model;

import project.Point;

import java.util.ArrayList;
import java.util.List;

/************************************************************/
/**
 * 
 */
public class Mission {
	/**
	 * 
	 */
	public List<Point> pointsReached;
	/**
	 * 
	 */
	public List<Point> pointsToReach;

	/**
	 * 
	 * @param pointsToReach 
	 */
	
	public Mission(List<Point> pointsToReach) {
		this.pointsToReach = pointsToReach;
		this.pointsReached = new ArrayList<Point>();
	}

	

	

	

	/**
	 * 
	 * @param pointsToReach 
	 */


	/**
	 * 
	 * @return 
	 */
	public List<Point> getPointsToReach() {
	}







	/**
	 * 
	 * @return 
	 */
	public void pointReached() {
		if(!pointsToReach.isEmpty()) {
			pointsReached.add(pointsToReach.remove(0));
		}
	}







	/**
	 * 
	 * @return 
	 */
	public Point getNextPoint() {
		if(!pointsToReach.isEmpty()) {
			return pointsToReach.get(0);
		}
		else {
			return null;
		}
	}







	/**
	 * 
	 * @return 
	 */
	public List<Point> getPointsReached() {
		return pointsReached;
	}







	/**
	 * 
	 * @param pointsToReach 
	 */
	public void Mission(List<Point> pointsToReach) {
	}


};
