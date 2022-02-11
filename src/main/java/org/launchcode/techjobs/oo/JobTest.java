package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class JobTest {

    private Job one;
    private Job two;
    private Job three;
    private Job four;
    private Job five;

    @Before
    public void createJobObjects() {
      one = new Job();
      two = new Job();
      three = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
      four = new Job("Programmer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Web development"), new CoreCompetency("Java"));
      five = new Job("Sales Associate", new Employer("Sonic"), new Location("Charlotte"), new PositionType("Marketing"), new CoreCompetency("Communication"));
        }


    @Test
    public void job_testSettingJobId_returnTrue() {
        assertTrue (one.getId() != two.getId());
        assertEquals(1, two.getId() - one.getId());
        assertEquals(1, one.getId());
    }

    @Test
    public void job_testSettingJobFields_returnTrue() {
        assertEquals("Product tester", three.getName());
        assertEquals("ACME", three.getEmployer().getValue());
        assertEquals("Desert", three.getLocation().getValue());
        assertEquals("Quality control", three.getPositionType());
        assertEquals("Persistence", three.getCoreCompetency());
    }

    @Test
    public void job_testJobsForEquality_returnsTrue() {
        assertFalse(four.equals(five));
    }

    @Test
    public void job_testToStringMethod_returnTrue() {
        char zeroIndex = three.toString().charAt(0);
        char lastIndex = three.toString().charAt(three.toString().length() - 1);
        assertEquals(zeroIndex, lastIndex);
    }
}

