// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package rover.Model;

import project.Point;

import java.util.LinkedList;
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
	 * @param pointsToReach  
	 */
	public Mission(List<Point> points){
		this.pointsToReach = points;
		this.pointsReached = new LinkedList<Point>();
	}
	
	/**
	 * 
	 * @return 
	 */
	public List<Point> getPointsToReach() {
		return this.pointsToReach;
	}

	/**
	 * 
	 * @return 
	 */
	public List<Point> getPointsReached() {
		return this.pointsReached;
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
	public Integer getProgress() {
		int nb1 = pointsToReach.size();
		int nb2 = pointsReached.size();
//		System.out.println(nb1);
//		System.out.println(nb2);
		return (int)((float)nb2/(nb1+nb2)*100);
	}

	
};