package org.usfirst.frc.team4764.robot.commands;

import org.usfirst.frc.team4764.robot.Robot;


import edu.wpi.first.wpilibj.Timer;

import org.usfirst.frc.team4764.robot.subsystems.FlipityFlop;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Timer;

/**
 *
 */
public class FlipityFlopLevel extends Command {


	Timer floptimer=new Timer();

	public FlipityFlopLevel() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.flipityFlop);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		floptimer.reset();
		floptimer.start();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.flipityFlop.setLevel();
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {


		if (floptimer.get()>5) {
			return true;
		}
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
		floptimer.reset();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		floptimer.reset();
	}
}