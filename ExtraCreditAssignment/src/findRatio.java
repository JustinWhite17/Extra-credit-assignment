public static double findRatio(int[] arr) {
    int smallest1 = Integer.MAX_VALUE;
    int smallest2 = Integer.MAX_VALUE;
    int largest1 = Integer.MIN_VALUE;
    int largest2 = Integer.MIN_VALUE;
    
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < smallest1) {
            smallest2 = smallest1;
            smallest1 = arr[i];
        } else if (arr[i] < smallest2) {
            smallest2 = arr[i];
        }
        
        if (arr[i] > largest1) {
            largest2 = largest1;
            largest1 = arr[i];
        } else if (arr[i] > largest2) {
            largest2 = arr[i];
        }
    }
    
    return ((double) (largest1 + largest2)) / ((double) (smallest1 + smallest2));
}


