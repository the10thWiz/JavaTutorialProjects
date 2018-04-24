package org.usfirst.frc.team1732.robot.commands;

import org.usfirst.frc.team1732.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ArcadeDrive extends Command {
	
	public ArcadeDrive() {
		requires(Robot.drivetrain);
	}
	
	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.drivetrain.stop();
	}
	
	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.drivetrain.set(Robot.oi.getLeftY() + Robot.oi.getLeftX() * 0.4,
				Robot.oi.getLeftY() - Robot.oi.getLeftX() * 0.4);
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
