package Bridge_Pattern;

public abstract class bird {
	Behavior behavior;
	public void show() {}
	public Behavior getBehavior() {
		return behavior;
	}
	public void setBehavior(Behavior behavior) {
		this.behavior = behavior;
	}
}
