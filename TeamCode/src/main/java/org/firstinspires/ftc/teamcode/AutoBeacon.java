/*


Auto Code bois!








*/

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="Team7342AutoBeacon", group="Autonomous")
public class Team7342AutoBeacon extends LinearOpMode {
    DcMotor rightMotor1;                                //
    DcMotor rightMotor2;
    DcMotor leftMotor1;
    DcMotor leftMotor2;
    DcMotor pullMotor;
    DcMotor launchMotor;
    DcMotor launchMotor2;
    DcMotor shootmotor1;
    DcMotor shootmotor2;
    DcMotor shootmotor3;
    /* Declare OpMode members. */
    HardwareK9bot robot = new HardwareK9bot();              // Use a K9'shardware
    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() throws InterruptedException {
        double left;
        double right;
        rightMotor1 = hardwareMap.dcMotor.get("rightMotor1");
        rightMotor2 = hardwareMap.dcMotor.get("rightMotor2");
        leftMotor1 = hardwareMap.dcMotor.get("leftMotor1");
        leftMotor2 = hardwareMap.dcMotor.get("leftMotor2");

        pullMotor = hardwareMap.dcMotor.get("pullMotor");
        launchMotor = hardwareMap.dcMotor.get("launchMotor");
        launchMotor2 = hardwareMap.dcMotor.get("launchMotor2");

        /* Initialize the hardware variables.
         * The init() method of the hardware class does all the work here
         */
        robot.init(hardwareMap);

        // Send telemetry message to signify robot waiting;
        telemetry.addData(" ", "Team 7342 ");    //
        telemetry.update();

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            {

                launchMotor.setPower(-1);                 //  READ THIS!!! YOU HAVE TO READ THIS!!!! READ THIS IF THE SHOOTING MOTOR SHOOTS THE WRONG WAY!!!!
                launchMotor2.setPower(1);   // Right motor launch
            }
            runtime.reset();
            while (opModeIsActive() && (runtime.seconds() < 3)) {
                telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
                telemetry.update();
                idle();
            }

            {
                pullMotor.setPower(-1);
                launchMotor.setPower(-1);                 //  READ THIS!!! YOU HAVE TO READ THIS!!!! READ THIS IF THE SHOOTING MOTOR SHOOTS THE WRONG WAY!!!!
                launchMotor2.setPower(1);   // Right motor launch
            }
            runtime.reset();
            while (opModeIsActive() && (runtime.seconds() < 3)) {
                telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
                telemetry.update();
                idle();
            }

            {
                leftMotor1.setPower(-0.5);
                leftMotor2.setPower(-0.5);
                rightMotor1.setPower(0.5);
                rightMotor2.setPower(0.5);
            }
            runtime.reset();
            while (opModeIsActive() && (runtime.seconds() < 3)) {
                telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
                telemetry.update();
                idle();
            }

            leftMotor1.setPower(-0.5);
            leftMotor2.setPower(-0.5);
            rightMotor1.setPower(-0.5);
            rightMotor2.setPower(-0.5);
            runtime.reset();
            while (opModeIsActive() && (runtime.seconds() < 0.4)) {
                telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
                telemetry.update();
                idle();
            }

            leftMotor1.setPower(-0.5);
            leftMotor2.setPower(-0.5);
            rightMotor1.setPower(0.5);
            rightMotor2.setPower(0.5);
            runtime.reset();
            while (opModeIsActive() && (runtime.seconds() < 2)) {
                telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
                telemetry.update();
                idle();
            }

            leftMotor1.setPower(-0);
            leftMotor2.setPower(-0);
            rightMotor1.setPower(-0);
            rightMotor2.setPower(0);
            sleep(999999999);
            idle();

        }
    }
}
