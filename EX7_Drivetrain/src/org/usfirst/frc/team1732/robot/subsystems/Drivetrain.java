package org.usfirst.frc.team1732.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	
	private TalonSRX left;
	private TalonSRX right;
	
	public void set(double l, double r) {
		left.set(ControlMode.PercentOutput, l);
		right.set(ControlMode.PercentOutput, r);
	}
	
	public void stop() {
		left.set(ControlMode.PercentOutput, 0);
		right.set(ControlMode.PercentOutput, 0);
	}
	
	public boolean isRunning() {
		return left.getMotorOutputPercent() != 0 || right.getMotorOutputPercent() != 0;
	}
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
