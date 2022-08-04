import java.util.*;

public interface SlotBookingService
{
  //method to create parking slot
  void createParkingSlot(int slotSize);

  //method to park vehicle
  void parkVehicle(String registrationNumber, Integer driverAge);

  // method to get Slot Number By Registration Number
  void getSlotNumberByRegistrationNumber(String registrationNumber);

  //method for leave parking impl
  void leaveParking(Integer slotNumber);

  //method to get Slots With Driver Age
  void getSlotsWithDriverAge(Integer driverAge);

  //method to get Vehicle Registration Number By Driver's Age
  void getVehicleRegistrationNumberByDriverAge(Integer driverAge);
}