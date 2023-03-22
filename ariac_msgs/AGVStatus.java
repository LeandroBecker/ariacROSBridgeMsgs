package ros.msgs.ariac_msgs;  

public class AGVStatus {
  public byte location; // KITTING=0, ASSEMBLY_FRONT=1, ASSEMBLY_BACK=2, WAREHOUSE=3, UNKNOWN=99
  public double position;
  public double velocity;

  public AGVStatus() {}

  public AGVStatus(byte l, double p, double v){
	this.location = l;
	this.position = p;
	this.velocity = v;
  }
}
