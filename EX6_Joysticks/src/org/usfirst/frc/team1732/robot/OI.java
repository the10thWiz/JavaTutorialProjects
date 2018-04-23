/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1732.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick left = new Joystick(0);
	public Joystick right = new Joystick(1);
	
	public double getLeftY() {
		return left.getY();
	}
	public double getLeftX() {
		return left.getX();
	}
	public double getRightY() {
		return right.getY();
	}
	public double getRightX() {
		return right.getX();
	}
}
