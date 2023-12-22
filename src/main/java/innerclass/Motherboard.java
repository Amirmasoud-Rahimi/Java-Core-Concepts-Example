package innerclass;

public class Motherboard {
    // Nested Class -> Static inner class
    static class USB {
        int USB2 = 1;
        int USB3 = 2;

        int getTotalUSBPorts() {
            return this.USB2 + this.USB3;
        }
    }

    public static void main(String[] args) {
        Motherboard.USB usb = new USB();
        System.out.println("Total USB Ports" + usb.getTotalUSBPorts());
    }
}