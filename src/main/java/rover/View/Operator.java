// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package rover.View;

import java.util.List;

import project.Point;
import rover.Controller.IMissionManager;
import rover.Controller.StrategyFactory;
import rover.Model.Rover;
import rover.View.IOperatorCreateMissionView;
import rover.View.IOperatorEnvironmentView;
import rover.View.IOperatorFaultView;
import rover.View.IOperatorRewardPointsView;

/************************************************************/
/**
 * 
 */
public class Operator implements rover.Controller.IOperatorFaultView {
	/**
	 * 
	 */
	public IOperatorCreateMissionView iOperatorCreateMissionview;
	/**
	 * 
	 */
	public IOperatorRewardPointsView iOperatorRewardPointsView;
	/**
	 * 
	 */
	public IOperatorEnvironmentView iOperatorEnvironmentView;
	/**
	 * 
	 */
	public IOperatorFaultView iOperatorFaultView;
	/**
	 * 
	 */
	public StrategyFactory strategyFactory;
	
	
	public Operator(String type) {
		if (type.equals("technical")) {
			iOperatorCreateMissionview = new TOperatorCreateMissionView();
			iOperatorEnvironmentView = new TOperatorEnvironmentView();
			iOperatorFaultView = new IOperatorFaultView();
			iOperatorRewardPointsView = new TOperatorRewardPointsView();
		
		} else if (type.equals("non-technical")) {
			iOperatorCreateMissionview = null;
			iOperatorEnvironmentView = new NTOperatorEnvironmentView();
			iOperatorFaultView = new IOperatorFaultView();
			iOperatorRewardPointsView = new NTOperatorRewardPointsView();
		}
	}
	

	/**
	 * 
	 * @return 
	 */
	public void updateLocation() {
	}

	/**
	 * 
	 * @return 
	 */
	public void updateMissionProgress() {
	}

	/**
	 * 
	 * @param rewardPoints 
	 * @return 
	 */
	public void notifyRewardPoints(int[] rewardPoints) {
	}

	/**
	 * 
	 * @param points 
	 * @param roverName 
	 */
	public void createMission(List<Point> points, Rover rover) {
		if (iOperatorCreateMissionview != null) {
			this.iOperatorCreateMissionview.createMission(points, rover);
		} else {
			System.out.println("Access to create mission denied");
		}
		
	}

	@Override
	public void notifyFault() {
		// TODO Auto-generated method stub
		
	}
};
