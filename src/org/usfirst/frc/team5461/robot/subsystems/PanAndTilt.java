package org.usfirst.frc.team5461.robot.subsystems;
import org.usfirst.frc.team5461.robot.commands.PanAndTiltCommand;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

public class PanAndTilt extends Subsystem {
	Servo pan;
	Servo tilt;
	double tiltVal = 0.5;
	double panVal = 0.5;
    public void initDefaultCommand() {
    setDefaultCommand(new PanAndTiltCommand());
    }
    public void incTilt() {
    	tiltVal+=0.1;
        if (tiltVal <= 0.2) {
        	tiltVal = 0.2;
        }
        if (tiltVal >= 0.8) {
        	tiltVal = 0.8;
        }
        if (panVal <= 0) {
        	panVal = 0;
        }
        if (panVal >= 1.0) {
        	panVal = 1.0;
        }

    } 
    public void decTilt() {
    	tiltVal-=0.1;
        if (tiltVal <= 0.2) {
        	tiltVal = 0.2;
        }
        if (tiltVal >= 0.8) {
        	tiltVal = 0.8;
        }
        if (panVal <= 0) {
        	panVal = 0;
        }
        if (panVal >= 1.0) {
        	panVal = 1.0;
        }

    }
    public void incPan() {
    	panVal+=0.1;
        if (tiltVal <= 0.2) {
        	tiltVal = 0.2;
        }
        if (tiltVal >= 0.8) {
        	tiltVal = 0.8;
        }
        if (panVal <= 0) {
        	panVal = 0;
        }
        if (panVal >= 1.0) {
        	panVal = 1.0;
        }

    }
    public void decPan() {
    	panVal-=0.1;
        if (tiltVal <= 0.2) {
        	tiltVal = 0.2;
        }
        if (tiltVal >= 0.8) {
        	tiltVal = 0.8;
        }
        if (panVal <= 0) {
        	panVal = 0;
        }
        if (panVal >= 1.0) {
        	panVal = 1.0;
        }
    }
    public PanAndTilt(){
    	pan = new Servo(0);
    	tilt = new Servo(1);
    }

    public void move(){
    	pan.set(panVal);
    	tilt.set(tiltVal);
    	System.out.println("panVal: " + panVal);
    	System.out.println("tiltVal: " + tiltVal);
    	System.out.println("PanPos: " + pan.getPosition());
    	System.out.println("TiltPos: " + tilt.getPosition());
    }

}

