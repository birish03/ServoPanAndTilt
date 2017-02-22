package org.usfirst.frc.team5461.robot.commands;

import org.usfirst.frc.team5461.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IncreaseTilt extends Command {

    public IncreaseTilt() {
    	requires(Robot.panAndTilt);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.panAndTilt.incTilt();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
