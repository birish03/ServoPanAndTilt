package org.usfirst.frc.team5461.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import org.usfirst.frc.team5461.robot.commands.DecreasePan;
import org.usfirst.frc.team5461.robot.commands.DecreaseTilt;
import org.usfirst.frc.team5461.robot.commands.IncreasePan;
import org.usfirst.frc.team5461.robot.commands.IncreaseTilt;
import org.usfirst.frc.team5461.robot.commands.PanAndTiltCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick leftstick = new Joystick(0);
	public DPadButton dpadUp = new DPadButton(new Point(0, 1), leftstick);
	public DPadButton dpadRight = new DPadButton(new Point(1, 0), leftstick);
	public DPadButton dpadDown = new DPadButton(new Point(0, -1), leftstick);
	public DPadButton dpadLeft = new DPadButton(new Point(-1, 0), leftstick);
	
	public OI() {
		dpadUp.whenPressed(new IncreaseTilt());
		dpadDown.whenPressed(new DecreaseTilt());
		dpadLeft.whenPressed(new DecreasePan());
		dpadRight.whenPressed(new IncreasePan());
		dpadUp.whenPressed(new PanAndTiltCommand());
		dpadDown.whenPressed(new PanAndTiltCommand());
		dpadLeft.whenPressed(new PanAndTiltCommand());
		dpadRight.whenPressed(new PanAndTiltCommand());
	}
	
	public Point getDPadValue(Joystick joystick) {
		int direction = joystick.getPOV(0);
		Point point = new Point();
		point.y = (int)Math.cos(Math.toRadians(direction));
		point.x = (int)Math.sin(Math.toRadians(direction));
		return point;
	}
	private class DPadButton extends Button {
		private Point _point;
		private Joystick _joystick;
		public DPadButton(Point point, Joystick joystick) {
			_point = point;
			_joystick = joystick;
		}

		@Override
		public boolean get() {
			Point dpadPoint = getDPadValue(_joystick);
			if (_point.x == dpadPoint.x && _point.y == dpadPoint.y) {
				return true;
			}
			return false;
		}
}

private static class Point {
	public int x;
	public int y;

	public Point() {
		/* no op */
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
}