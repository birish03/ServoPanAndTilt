package org.usfirst.frc.team5461.robot.commands;

import org.usfirst.frc.team5461.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PanAndTiltCommand extends Command {

    public PanAndTiltCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.panAndTilt);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//double xL = Robot.oi.leftstick.getX();
    	//double tilt = Robot.oi.leftstick.getY();
    	//double pan = Robot.oi.leftstick.getRawAxis(Joystick.AxisType.kThrottle.value);
    	//double leftVal=-joy.getRawAxis(leftstick.AxisType.kY.value);
    	//double rightVal=-joy.getRawAxis(Joystick.AxisType.kZ.value);
    	//double yR = Robot.oi.rightstick.getY();
    	Robot.panAndTilt.move();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
