class CarDriver {
  private String registrationNumber;
  private String driverName;
  private int driverAge;
  
  public CarDriver() {
    registrationNumber = "";
    driverName = "";
    driverAge = 0;
  }

  public CarDriver(String registrationNumber, String driverName, int driverAge) {
    this.registrationNumber = registrationNumber;
    this.driverName = driverName;
    this.driverAge = driverAge;
  }

  public String getRegistrationNumber() {
    return this.registrationNumber;
  }

  public String getDriverName() {
    return this.driverName;
  }
  
  public int getDriverAge() {
    return this.driverAge;
  }
}