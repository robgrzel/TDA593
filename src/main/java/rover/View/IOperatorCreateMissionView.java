// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package rover.View;

import java.util.List;

import project.Point;
import rover.Model.Rover;
import rover.Controller.IMissionManager;
import rover.Controller.IStrategy;
/************************************************************/
/**
 * 
 */
public interface IOperatorCreateMissionView {

	/**
	 * 
	 * @param points 
	 * @param rover 
	 * @return 
	 * @param missionManager 
	 * @param strategy 
	 */
	public void createMission(List<Point> points, Rover rover, IMissionManager missionManager, IStrategy strategy);
};
