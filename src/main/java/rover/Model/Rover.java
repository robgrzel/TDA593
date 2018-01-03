// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package rover.Model;

import project.AbstractRobotSimulator;
import project.Point;
import rover.Controller.IAccessManager;
import rover.Controller.IOperatorFaultView;
import rover.Controller.IStrategy;
import rover.Controller.Strategy1;
import rover.Model.AbstractArea;
import rover.Model.IRoverLocator;
import rover.Model.IRoverManager;
import rover.Model.IVisitableArea;
import rover.Model.Mission;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Simulator.AccessController;
import project.AbstractRobotSimulator;

/************************************************************/
/**
 * 
 */

public class Rover extends AbstractRobotSimulator implements IRoverManager, IRoverLocator {
	/**
	 * 
	 */
	private Point destination;
	/**
	 * 
	 */
	private Mission mission;
	/**
	 * 
	 */
	private boolean paused;
	/**
	 * 
	 */
	private boolean sleeping;
	/**
	 * 
	 */
	private IStrategy strategy;
	/**
	 * 
	 */
	private IAccessManager accessManager;
	/**
	 * 
	 */
	private List<AbstractArea> listAreas;

	/**
	 * 
	 * @param position 
	 * @param name 
	 * @param accessManager 
	 * @param listAreas 
	 */
	public Rover(Point position, String name, IAccessManager accessManager, List<AbstractArea> listAreas) {
		super(position, name);
		paused = false;
		sleeping = true;
		this.accessManager = accessManager;
		this.listAreas = listAreas;
		this.strategy = new Strategy1(); //By default
	}

	/**
	 * 
	 * @return 
	 */
	public Point getDestination() {
		return destination;
	}

	/**
	 * 
	 * @return 
	 */
	public Mission getMission() {
		return mission;
	}

	/**
	 * 
	 * @return 
	 */
	public boolean isPaused() {
		return paused;
	}

	/**
	 * 
	 * @return 
	 */
	public boolean isSleeping() {
		return sleeping;
	}

	/**
	 * 
	 * @return 
	 */
	public IStrategy getStrategy() {
		return strategy;
	}

	/**
	 * 
	 * @return 
	 */
	public List<AbstractArea> getListArea() {
		return listAreas;
	}
	
	/**
	 * 
	 * @return 
	 */
	public IAccessManager getAccessManager() {
		return accessManager;
	}

	/**
	 * 
	 * @param destination 
	 * @return 
	 */
	public void setDestination(Point destination) {
		if (destination == null) {
			throw new NullPointerException("The destination cannot be null");
		}
		getAgent().setDestination(destination);
		this.destination = destination;
	}

	/**
	 * 
	 * @return 
	 */
	public void goToNextPoint() {
		mission.pointReached();
		Point nextPoint = this.mission.getNextPoint();
		if(nextPoint != null) {
			setDestination(nextPoint);
		}
		else {
			sleeping = true;
		}
	}

	/**
	 * 
	 * @param roverName 
	 * @return 
	 */
	public Point getLocation(String roverName) {
		return this.getPosition();
	}

	/**
	 * 
	 * @param mission 
	 * @return 
	 * @param strategy 
	 */
	public boolean provideMission(Mission mission, IStrategy strategy) {
		this.strategy = strategy;
		this.mission = mission;
		Point nextPoint = this.mission.getNextPoint();
		if(nextPoint != null) {
			setDestination(nextPoint);
		}
		sleeping = false;
		return true;
	}

	/**
	 * 
	 * @return 
	 */
	public boolean pauseRover() {
		if(!sleeping){
			Point p = this.getPosition();
			paused = true;
			setDestination(p); //see what happen with NULL
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * 
	 * @return 
	 */
	public boolean continueRover() {
		if(!sleeping){
			Point nextPoint = this.mission.getNextPoint();
			setDestination(nextPoint);
			paused = false;
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * 
	 * @param strategy 
	 * @return 
	 */
	public boolean changeStrategy(IStrategy strategy) {
		this.strategy = strategy;
		return true;
	}

	/**
	 * 
	 * @return 
	 */
	public void routine() {
		strategy.applyBehaviour(this);
	}

	/**
	 * 
	 * @return 
	 */
	public List<IVisitableArea> getAreas() {
		List<IVisitableArea> res = new ArrayList<IVisitableArea>();
		Iterator<AbstractArea> iter = listAreas.iterator();
		while (iter.hasNext()) {
			IArea area = iter.next();
			if(area.isInArea(this.getPosition())) {
				res.add((IVisitableArea) area);
			}
		}
		return res;
	}

	/**
	 * 
	 * @param position 
	 * @param name 
	 * @param accessManager 
	 * @param listAreas 
	 */
	public void Rover(Point position, String name, IAccessManager accessManager, IVisitableArea[] listAreas) {
	}

	/**
	 * 
	 * @return 
	 */
	public boolean removeMission() {
	}

	/**
	 * 
	 * @return 
	 */
	public IVisitableArea[] isInArea() {
	}

	/**
	 * 
	 * @param roverName 
	 * @return 
	 */
	public Point getLocation(undefined roverName) {
	}

};

