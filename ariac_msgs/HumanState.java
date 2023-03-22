package ros.msgs.ariac_msgs;  

import ros.msgs.geometry_msgs.Point;
import ros.msgs.geometry_msgs.Vector3;


public class HumanState {

/*
public static class Position{
	public double x;
	public double y;
	public double z;
}

public static class Velocity{
	public double x;
	public double y;
	public double z;
} 
*/

public Point human_position;	
public Point robot_position;	
public Vector3 human_velocity;	
public Vector3 robot_velocity;	


	public HumanState() {}

	public HumanState(Point hp, Point rp, Vector3 hv, Vector3 rv){
		this.human_position = hp;
		this.robot_position = rp;
		this.human_velocity = hv;
		this.robot_velocity = rv;
	}
}
