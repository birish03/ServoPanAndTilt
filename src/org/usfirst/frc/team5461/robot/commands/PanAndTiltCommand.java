package org.usfirst.frc.team5461.robot.commands;

import org.usfirst.frc.team5461.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class PanAndTiltCommand extends Command {

    public PanAndTiltCommand() {
    	requires(Robot.panAndTilt);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.panAndTilt.move();
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
