package org.usfirst.frc.team1732.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SpinMotor extends Subsystem {

    private double speed;
    
    public void init() {
    	speed = 0;
    }
    
    public void setSpeed(double s) {
    	speed = s;
    }
    
    public double getSpeed() {
    	return speed;
    }
    
    public boolean isRunning() {
    	return speed != 0;
    }
    
    public void stop() {
    	speed = 0;
    }

	@Override
	protected void initDefaultCommand() {
	}

}

