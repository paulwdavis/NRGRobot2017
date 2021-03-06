package org.usfirst.frc.team948.robot.commands;

import org.usfirst.frc.team948.robot.OI;
import org.usfirst.frc.team948.robot.Robot;
import org.usfirst.frc.team948.utilities.MathUtil;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ManualDrive extends Command {
	public ManualDrive() {
		this.requires(Robot.drive);
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void execute() {
		double leftJoystick = MathUtil.deadband(-OI.leftJoystick.getY(), 0.1);
		double rightJoystick = MathUtil.deadband(-OI.rightJoystick.getY(), 0.1);
		Robot.drive.tankDrive(leftJoystick, rightJoystick);
	}

	@Override
	protected void end() {
		Robot.drive.stop();
	}

	@Override
	protected void interrupted() {
		end();
	}
}
