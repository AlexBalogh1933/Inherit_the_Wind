class SalaryWorkerTest {
    SalaryWorker p1, p2, p3, p4, p5, p6;

    @BeforeEach
    void setUp()
    {
        // firstName, lastName, idString, inputTitle, yearOfBirth, hourlyPayRate, annualSalary
        p1 = new Worker("Alex", "Balogh", "00000A", "Mr", 2000, 25.0, 47000);
        p2 = new Worker("Sally", "Tester2", "00000B", "Mrs", 1975, 30.0, 50000);
        p3 = new Worker("Bob", "Tester3", "00000C", "Mr", 1960, 100.0, 1000000);
    }

    @Test
    void getIDSeed()
    {
        assertEquals(3, SalaryWorker.getIDSeed());
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
    void getHourlyPayRate() {
        assertEquals(25.0, p1.getHourlyPayRate());
    }

    @Test
    void getAnnualSalary() {
        assertEquals(47000, p1.getAnnualSalary());
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
    void setAnnualSalary() {
        p1.setAnnualSalary(45000);
        assertEquals(45000, p1.getAnnualSalary())
    }
}