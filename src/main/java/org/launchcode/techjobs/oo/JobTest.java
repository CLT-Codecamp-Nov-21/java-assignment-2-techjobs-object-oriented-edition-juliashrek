package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;


public class JobTest {

//    private Job one;
//    private Job two;
//    private Job three;
//    private Job four;
//    private Job five;

//    @Before
//    public void createJobObjects() {
//      one = new Job();
//      two = new Job();
//      three = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//      four = new Job("Programmer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Web development"), new CoreCompetency("Java"));
//      five = new Job("Sales Associate", new Employer("Sonic"), new Location("Charlotte"), new PositionType("Marketing"), new CoreCompetency("Communication"));
//        }


    @Test
    public void testSettingJobId() {
        Job one = new Job();
        Job two = new Job();
        assertNotEquals (one.getId(), two.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job three = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(three.getName() instanceof String);
        assertEquals("Product tester", three.getName());
        assertTrue(three.getEmployer() instanceof Employer);
        assertEquals("ACME", three.getEmployer().getValue());
        assertTrue(three.getLocation() instanceof Location);
        assertEquals("Desert", three.getLocation().getValue());
        assertTrue(three.getPositionType() instanceof PositionType);
        assertEquals("Quality control", three.getPositionType().getValue());
        assertTrue(three.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", three.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job four = new Job("Programmer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Web development"), new CoreCompetency("Java"));
        Job five = new Job("Programmer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Web development"), new CoreCompetency("Java"));

                assertFalse(four.equals(five));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job three = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals('\n',three.toString().charAt(0));
        assertEquals('\n',three.toString().charAt(three.toString().length() - 1));
        // assertEquals(zeroIndex, lastIndex);
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job three = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testString = "\nId: " + three.getId() +
                "\nName: " + three.getName() +
                "\nEmployer: " + three.getEmployer() +
                "\nLocation: " + three.getLocation() +
                "\nPositionType: " + three.getPositionType() +
                "\nCoreCompetency: " + three.getCoreCompetency() +
                '\n';
        assertEquals(testString,three.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job three = new Job("", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency(""));
        String testString = "\nId: " + three.getId() +
                "\nName: Data not available." +
                "\nEmployer: ACME" +
                "\nLocation: Data not available." +
                "\nPositionType: Quality control" +
                "\nCoreCompetency: Data not available." +
                '\n';
        assertEquals(testString,three.toString());
    }


}

