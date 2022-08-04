class ParkingTicketImpl implements ParkingTicket
{
  private Integer slotNumber;
  private String registrationNumber;
  private Integer driverAge;

  //method to get Slot Numbers
  public Integer getSlotNumber() 
  { 
    return slotNumber; 
  }

  //method to set Slot Numbers
  public void setSlotNumber(Integer slotNumber)
  {
        this.slotNumber = slotNumber;
  }

  // method to get Registration Number Of Vehicle
  public String getRegistrationNumber() 
  { 
    return registrationNumber; 
  }

  //method to set Registration Number Of Vehicle
  public void setRegistrationNumber(String registrationNumber)
  {
        this.registrationNumber = registrationNumber;
  }

  //method to get Driver's age
  public Integer getDriverAge() 
  { 
    return driverAge;
  }

  //method to set Driver's age
  public void setDriverAge(Integer driverAge)
  {
        this.driverAge = driverAge;
  }
}