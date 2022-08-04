//utility class for all utility function
class Util {

    public static ParkingTicket setParkingTicketDetails(Integer slotNum, String registrationNumber, Integer driverAge) {
        ParkingTicket parkingTicket = new ParkingTicketImpl();
        parkingTicket.setSlotNumber(slotNum);
        parkingTicket.setRegistrationNumber(registrationNumber);
        parkingTicket.setDriverAge(driverAge);

        return parkingTicket;
    }

}