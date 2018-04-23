package org.usfirst.frc.team1732.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SpinMotor extends Subsystem {
	
	private double speed;
	private TalonSRX motor;
	
	public void init() {
		speed = 0;
		motor = new TalonSRX(0);
	}
	
	public void setSpeed(double s) {
		speed = s;
		motor.set(ControlMode.PercentOutput, speed);
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public boolean isRunning() {
		return speed != 0;
	}
	
	public void stop() {
		speed = 0;
		motor.set(ControlMode.PercentOutput, 0);
	}
	
	@Override
	protected void initDefaultCommand() {
	}
	
}
