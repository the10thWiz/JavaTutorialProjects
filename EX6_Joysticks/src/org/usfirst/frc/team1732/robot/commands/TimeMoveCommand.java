/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team1732.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team1732.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class TimeMoveCommand extends Command {
	private int time = 0;
	public TimeMoveCommand() {
		requires(Robot.spinMotor);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		Robot.spinMotor.setSpeed(0.5);
		time = 0;
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		time++;
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return time >= 100;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.spinMotor.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		Robot.spinMotor.stop();
	}
}
