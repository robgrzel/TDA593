// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package rover;

import project.AbstractRobot;
import project.Point;
import rover.Area;
import rover.IAccessManager;
import rover.IOperatorFaultView;
import rover.IRoverLocation;
import rover.IRoverManager;
import rover.IStrategy;
import rover.Mission;

/************************************************************/
/**
 * 
 */
public class Rover extends AbstractRobotSimulator implements IRoverManager, IRoverLocation {
	/**
	 * 
	 */
	private Point destination;
	/**
	 * 
	 */
	public Mission mission;
	/**
	 * 
	 */
	public boolean paused;
	/**
	 * 
	 */
	public boolean sleeping;
	/**
	 * 
	 */
	public IStrategy strategy;
	/**
	 * 
	 */
	public IAccessManager accessManager;
	/**
	 * 
	 */
	public Area[] listAreas;

	/**
	 * 
	 * @param position 
	 * @param name 
	 */
	public void Rover(Point position, String name) {
	}

	/**
	 * 
	 * @return 
	 */
	public Point getDestination() {
	}

	/**
	 * 
	 * @return 
	 */
	public Mission getMission() {
	}

	/**
	 * 
	 * @return 
	 */
	public boolean isPaused() {
	}

	/**
	 * 
	 * @return 
	 */
	public boolean isSleeping() {
	}

	/**
	 * 
	 * @return 
	 */
	public IStrategy getStrategy() {
	}

	/**
	 * 
	 * @return 
	 */
	public Area[] getListArea() {
	}

	/**
	 * 
	 * @param point 
	 * @return 
	 */
	public void setDestination(Point point) {
	}

	/**
	 * 
	 * @param strategy 
	 * @return 
	 */
	public void setStrategy(IStrategy strategy) {
	}

	/**
	 * 
	 * @return 
	 */
	public void goToNextPoint() {
	}

	/**
	 * 
	 * @param roverName 
	 * @return 
	 */
	public Point getLocation(String roverName) {
	}

	/**
	 * 
	 * @param mission 
	 * @return 
	 * @param strategy 
	 */
	public boolean provideMission(Mission mission, IStrategy strategy) {
	}

	/**
	 * 
	 * @return 
	 */
	public boolean pauseRover() {
	}

	/**
	 * 
	 * @return 
	 */
	public boolean continueRover() {
	}

	/**
	 * 
	 * @param strategy 
	 * @return 
	 */
	public boolean changeStrategy(IStrategy strategy) {
	}
};
