class Start {
    public static void main(String[] data) {
        // Sqquential search
        boolean found = false;
        int city = 10500;
        int[] area = { 10500, 10330, 10700, 11000, 12000 };
        for(int i = 0; i < area.length; i++) {
            if (city == area[i]) {
                found = true;
            }
        }
        System.out.println(found ? "Available" : "Not Available");
    }
}