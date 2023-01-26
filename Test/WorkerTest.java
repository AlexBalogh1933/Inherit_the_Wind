class WorkerTest
{
    Worker p1, p2, p3, p4, p5, p6;

    @BeforeEach
    void setUp()
    {
        // firstName, lastName, idString, inputTitle, yearOfBirth, year, hourlyPayRate, hoursWorked
        p1 = new Worker("Alex", "Balogh", "00000A", "Mr", 2000, 2015, 15.0, 45);
        p2 = new Worker("Sally", "Tester2", "00000B", "Mrs", 1975, 2000, 17.0, 50);
        p3 = new Worker("Bob", "Tester3", "00000C", "Mr", 1960, 2019, 12.0, 36);
        Person.setIDSeed(0);
        // firstName, lastName, yearOfBirth, hourlyPayRate, hoursWorked
        p4 = new Worker("Sally", "Tester3", 1975, 20.0, 20);
        p5 = new Worker("Fred", "Tester4", 1970, 10.0, 26);
        p6 = new Worker("Cindy", "Tester5", 1975, 16.0, 41);
    }

    @Test
    void getIDSeed()
    {
        assertEquals(4, Person.getIDSeed());
    }
    @Test
    void getIdString()
    {
        assertEquals("00000A", p1.getIdString());
    }
    @Test
    void getFirstName() {
        assertEquals("Alex", p1.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Balogh", p1.getLastName());
    }

    @Test
    void getYearOfBirth() {
        assertEquals(2000, p1.getYearOfBirth());
    }
    @Test
    void setIdString() {
        p1.setIdString("00000B");
        assertEquals("00000B", p1.getIdString());
    }

    @Test
    void setFirstName() {
        p1.setFirstName("Sally");
        assertEquals("Sally", p1.getFirstName());
    }

    @Test
    void setLastName() {
        p1.setLastName("Tester2");
        assertEquals("Tester2", p1.getLastName());
    }

    @Test
    void setYearOfBirth() {
        p1.setYearOfBirth(1975);
        assertEquals(1975, p1.getYearOfBirth());
    }

    @Test
    void setHourlyPayRate() {
        p1.setHourlyPayRate(16.0);
        assertEquals(16.0, p1.getHourlyPayRate())
    }

    @Test
    void setHoursWorked() {
        p1.setHoursWorked(40);
        assertEquals(40, p1.getHoursWorked())
    }
}