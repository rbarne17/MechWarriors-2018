package org.usfirst.frc.team4764.robot.commands;

import org.usfirst.frc.team4764.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class FlipityFlopUp extends Command {

	public FlipityFlopUp() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.flipityFlop);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.flipityFlop.reset();

	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.flipityFlop.setUp();
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		if (Robot.flipityFlop.flipityFlopUp()) {

			return true;
		}
		return false;

	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.flipityFlop.reset();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		Robot.flipityFlop.reset();
	}
}