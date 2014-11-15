package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Solenoid;

public class Shooter {
	
	public Shooter() {
		
	}
	
	Jaguar shootingWheel = new Jaguar(HWR.SHOOTER_MOTOR);
	Solenoid shootingSolenoid = new Solenoid(HWR.FIRE_PISTON);
	Solenoid spittingSolenoid = new Solenoid(HWR.SPIT_PISTON);
	public void accelerateWheel() {
		shootingWheel.set(0.75);
	}
	
	public void shoot() {
		shootingSolenoid.set(true);
		shootingSolenoid.set(false);
	}
	
	public void spit() {
		
	}

}
