// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package rover.Controller;

import rover.Controller.IAccessManager;
import rover.Model.Rover;

import java.util.Iterator;
import java.util.List;

import Simulator.AccessController;

/************************************************************/
/**
 * 
 */
public class AccessManager implements IAccessManager {
	/**
	 * 
	 */
	public List<AccessController> listAccessController;

	/**
	 * 
	 * @param listAreaController 
	 */
	public AccessManager(List<AccessController> listAccessController) {
		this.listAccessController = listAccessController;
	}

	/**
	 * 
	 * @param rover 
	 * @return 
	 */
	private AccessController isInAreaController(Rover rover) {
		for (Iterator<AccessController> iter = listAccessController.iterator(); iter.hasNext(); ) {
			AccessController ac = iter.next();
			if(ac.isInArea(rover) && !ac.isTheOwner(rover)) {
				return ac;
			}
		}
		return null;
	}

	/**
	 * 
	 * @param rover 
	 * @return 
	 */
	private void releaseAccess(Rover rover) {
		for (Iterator<AccessController> iter = listAccessController.iterator(); iter.hasNext(); ) {
			AccessController ac = iter.next();
			ac.release(rover);
		}
	}

	/**
	 * 
	 * @param rover 
	 * @return 
	 */
	private void acquireAccess(Rover rover) {
		AccessController ac = isInAreaController(rover);
		if(ac != null) {	//if the rover is in an area
			if(!ac.tryAcquire(rover)) {	//if the rover cannot acces to the area
				if(!rover.isPaused()) {	//pause the rover if it is not already paused
					rover.pauseRover();
				}
			}
			else {						//if the rover can acces to the area
				if(rover.isPaused()) {	//allow the rover to move if it was paused
					rover.continueRover();
				}
			}
		}
	}

	@Override
	public void manageAccess(Rover rover) {
		releaseAccess(rover);
		acquireAccess(rover);	
	}
	
};
