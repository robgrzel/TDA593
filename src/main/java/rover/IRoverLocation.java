// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package rover;

import project.Point;
import rover.Area;

/************************************************************/
/**
 * 
 */
public interface IRoverLocation {
	/**
	 * 
	 * @param roverName 
	 * @return 
	 */
	public Point getLocation(String roverName);

	/**
	 * 
	 * @return 
	 */
	public Area isInArea();
};
