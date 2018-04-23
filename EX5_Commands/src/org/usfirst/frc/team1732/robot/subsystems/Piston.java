package org.usfirst.frc.team1732.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Piston extends Subsystem {
	private Solenoid piston;

	public void init() {
		piston = new Solenoid(0, 0);
	}

	public void setExtended(boolean b) {
		piston.set(b);
	}

	public boolean getExtended() {
		return piston.get();
	}

	public void stop() {
		piston.set(false);
	}

	@Override
	protected void initDefaultCommand() {
	}

}
