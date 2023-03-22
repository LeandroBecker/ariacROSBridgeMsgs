package ros.msgs.ariac_msgs;  

//import ros.msgs.std_msgs.Bool;


public class Robots {

	public boolean floor_robot;   //public Bool 
	public boolean ceiling_robot; //public Bool 

	public Robots() {}

	public Robots(boolean fr, boolean cr){ 
		this.floor_robot   = fr;  //if Bool: this.floor_robot.data   = fr;
		this.ceiling_robot = cr;  //if Bool: this.ceiling_robot.data = cr;
	}
}
