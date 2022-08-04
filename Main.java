import java.io.*;

class Main {
    private static SlotBookingService slotBookingService;

    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        readAndExecuteFile(file);
    }

    public static void readAndExecuteFile(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        slotBookingService = new SlotBookingServiceImpl();
        while ((line = bufferedReader.readLine()) != null) {
            triggerParkingFunction(line, slotBookingService);
        }

        bufferedReader.close();
        fileReader.close();
    }

    public static void triggerParkingFunction(String command, SlotBookingService slotBookingService) {
        String[] commandArray = command.split(" ");

        switch (commandArray[0]) {
            case "Create_parking_lot":
                Integer totalSlotNum = Integer.parseInt(commandArray[1]);
                slotBookingService.createParkingSlot(totalSlotNum);
                break;
            case "Park":
                String registrationNumberForParking = commandArray[1];
                Integer driverAgeForPaking = Integer.parseInt(commandArray[3]);
                slotBookingService.parkVehicle(registrationNumberForParking, driverAgeForPaking);
                break;
            case "Slot_numbers_for_driver_of_age":
                Integer driverAgeToFetchSlotNumber = Integer.parseInt(commandArray[1]);
                slotBookingService.getSlotsWithDriverAge(driverAgeToFetchSlotNumber);
                break;
            case "Slot_number_for_car_with_number":
                String registrationNumberToFetchSlotNumber = commandArray[1];
                slotBookingService.getSlotNumberByRegistrationNumber(registrationNumberToFetchSlotNumber);
                break;
            case "Leave":
                Integer slotNumber = Integer.parseInt(commandArray[1]);
                slotBookingService.leaveParking(slotNumber);
                break;
            case "Vehicle_registration_number_for_driver_of_age":
                Integer driverAge = Integer.parseInt(commandArray[1]);
                slotBookingService.getVehicleRegistrationNumberByDriverAge(driverAge);
                break;
        }

    }
}