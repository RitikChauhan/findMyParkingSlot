import java.util.*;

//class implementing all methods declared in SlotBookingService interface
class SlotBookingServiceImpl implements SlotBookingService {
    private ParkingTicket[] parkingTickets;

    public void createParkingSlot(int slotSize) {
        parkingTickets = new ParkingTicket[slotSize];
        System.out.println("Created parking of " + slotSize + " slots");
    }

    public void parkVehicle(String registrationNumber, Integer driverAge) {
        int slotNum = 0;
        boolean slotAvailable = false;
        for (ParkingTicket parkingTicket: parkingTickets) {
            if (parkingTicket == null) {
                slotAvailable = true;
                ParkingTicket newParkingTicket = Util.setParkingTicketDetails(slotNum + 1, registrationNumber, driverAge);
                parkingTickets[slotNum] = newParkingTicket;

                System.out.println("Car with vehicle registration number " + registrationNumber + " has been parked at slot number " + (slotNum + 1));

                break;
            }
            slotNum += 1;
        }

        if (!slotAvailable) {
            System.out.println("Car with vehicle registration number " + registrationNumber + " has not been parked due to unavailability of slots");
        }
    }


    public void getSlotNumberByRegistrationNumber(String registrationNumber) {
        for (ParkingTicket parkingTicket: parkingTickets) {
            if (parkingTicket == null) {
                continue;
            }
            if (parkingTicket.getRegistrationNumber().equals(registrationNumber)) {
                System.out.println(parkingTicket.getSlotNumber());
            }
        }
    }

    public void leaveParking(Integer slotNumber) {
        int totalParkingSize = parkingTickets.length;
        if (slotNumber > totalParkingSize) {
            System.out.println("Invalid slot number");
        } else {
            if (parkingTickets[slotNumber - 1] == null) {
                System.out.println("Slot " + slotNumber + " already empty");
            } else {
                ParkingTicket parkingTicket = parkingTickets[slotNumber - 1];
                parkingTickets[slotNumber - 1] = null;

                System.out.println("Slot number " + slotNumber + " vacated, the car with vehicle registration number " + parkingTicket.getRegistrationNumber() + " left the space, the driver of the car was of age " + parkingTicket.getDriverAge());
            }

        }
    }

    public void getSlotsWithDriverAge(Integer driverAge) {
        List < Integer > driverAgeList = new ArrayList < Integer > ();

        for (ParkingTicket parkingTicket: parkingTickets) {
            if (parkingTicket == null) {
                continue;
            } else {
                if (parkingTicket.getDriverAge() == driverAge) {
                    driverAgeList.add(parkingTicket.getSlotNumber());
                }
            }
        }

        System.out.println(driverAgeList);
    }

    public void getVehicleRegistrationNumberByDriverAge(Integer driverAge) {
        List < String > registrationNumberList = new ArrayList < String > ();

        for (ParkingTicket parkingTicket: parkingTickets) {
            if (parkingTicket == null) {
                continue;
            } else {
                if (parkingTicket.getDriverAge() == driverAge) {
                    registrationNumberList.add(parkingTicket.getRegistrationNumber());
                }
            }
        }

        System.out.println(registrationNumberList);
    }

}