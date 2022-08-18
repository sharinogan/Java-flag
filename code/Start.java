class Start {
    public static void main(String[] data) {
        int[] number = { 1, 2, 3, 4 };
        boolean flag = true;
        for(int i = 2; i < number.length; i++) {
            if (number[i] % i == 0) { 
              flag = false;               
            }     
        }
        System.out.println(flag ? "Prime" : "Composite");
    }
}