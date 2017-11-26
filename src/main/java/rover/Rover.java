// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package rover;

import project.AbstractRobotSimulator;
import project.Point;

/************************************************************/
/**
 * 
 */
public class Rover extends AbstractRobotSimulator implements IRoverStrategy, IRoverLocation {
	IPointAchieved pointAchieved = new StrategyManager();


	public Rover(Point position, String name) {
		super(position, name);
	}

	public Point getLocation(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void goTo(Point savePoint) {
		this.setDestination(savePoint);
		while (this.getLocation(this.getName()) != savePoint) {
			
		} 
		pointAchieved.achievedPoint(savePoint, this.getName());
		
	}
	
};
