package org.usfirst.frc.team948.robot.commands;

import org.usfirst.frc.team948.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

//toggle light command
public class FlipCameraLight extends Command {
	private static boolean isOn = true;

	public FlipCameraLight() {
		requires(Robot.cameraLight);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		if (isOn) {
			Robot.cameraLight.turnOn();
		} else {
			Robot.cameraLight.turnOff();
		}
		isOn = !isOn;
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return true;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}