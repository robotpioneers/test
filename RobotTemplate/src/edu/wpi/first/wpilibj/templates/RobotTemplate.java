/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Timer;

import edu.wpi.first.wpilibj.SimpleRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends SimpleRobot {
    RobotDrive chassis = new RobotDrive(1,2);
    Joystick leftStick = new Joystick(1);
    Joystick rightStick = new Joystick(2);
    /**
     * This function is called once each time the robot enters autonomous mode.
     */
    public void autonomous() {
        chassis.setSafetyEnabled(false) ;
        chassis.drive(-0.5, 0.0) ;
        Timer.delay(2.0) ;
        chassis.drive(0.0, 0.0) ;
        
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {
        chassis.setSafetyEnabled(true) ;
        while (isOperatorControl() && isEnabled()) { 
          // chassis.arcadeDrive(leftStick.getY()*((l(eftStick.getZ()*-1.0)+1)/2.0),leftStick.getX()*-1,true);
            chassis.tankDrive(leftStick, rightStick, true);
            
            Timer.delay(0.01);    
        }

    }
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {
    
    }
}
