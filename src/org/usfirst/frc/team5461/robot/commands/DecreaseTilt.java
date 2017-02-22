package org.usfirst.frc.team5461.robot.commands;

import org.usfirst.frc.team5461.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DecreaseTilt extends Command {

    public DecreaseTilt() {
    	requires(Robot.panAndTilt);
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.panAndTilt.decTilt();
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
