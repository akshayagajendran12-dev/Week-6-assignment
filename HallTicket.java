public class HallTicket {
    String studentName;
    int seatNumber;

    public HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }

    public static void main(String[] args) {
        HallTicket priya = new HallTicket("Priya", 0);

        // Both variables refer to the same object
        HallTicket copy = priya;

        // Change the object through the second reference
        copy.seatNumber = 45;

        System.out.println(
            "Priya's seatNumber (via first variable): "
                    + priya.seatNumber
        );
        System.out.println("copy == priya: " + (copy == priya));

        // Create a separate object with identical field values
        HallTicket separate = new HallTicket("Priya", 45);

        System.out.println(
            "separate == priya: " + (separate == priya)
        );
    }
}
