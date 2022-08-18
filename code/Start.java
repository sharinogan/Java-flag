class Start {
    public static void main(String[] data) {
        int[] a = { 2, 1, 3, 4, 5, 9, 7 };  // No
        int[] b = { 1, 2, 3, 4, 6, 8, 9 }; // Yes
        boolean flag = true;
        
        // Check that is values in array are sort ot not.
        // if it sort, print "Yes". then "No"
        
        // #1
//        for (int i = 0; i < b.length - 1; i++) {
//            if(b[i] <= b[i+1]) {
//                
//            }
//            if (b[i] > b[i+1]) {
//                flag = false;
//            }
//        }                  
//        System.out.println(flag ? "Yes" : "No");

        // #2
        for(int i = 1; i < b.length; i++) {
            if(b[i-1] <= b[i]) { }
            if(b[i-1] > b[i]) {
                flag = false;
            }
        }
        System.out.println(flag ? "Yes" : "No");
    }
}