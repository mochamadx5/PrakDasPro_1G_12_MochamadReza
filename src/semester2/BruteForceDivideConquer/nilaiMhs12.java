package semester2.BruteForceDivideConquer;


public class nilaiMhs12 {
    
    public static int maxUTS(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int mid = (l + r) / 2;
        int lMax = maxUTS(arr, l, mid);
        int rMax = maxUTS(arr, mid + 1, r);
        return Math.max(lMax, rMax);
    }
    
    public static int minUTS(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l]; 
        }
        int mid = (l + r) / 2;
        int lMin = minUTS(arr, l, mid);
        int rMin = minUTS(arr, mid + 1, r);
        return Math.min(lMin, rMin);
    }
    public static double rataUAS(int[] arr) {
        double total = 0;
        for (int value : arr) {
            total += value;
        }
        return total / arr.length;
    }

    public static void main(String[] args) {
        
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82}; 
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84}; 

        int utsMax = maxUTS(nilaiUTS, 0, nilaiUTS.length - 1);
        int utsMin = minUTS(nilaiUTS, 0, nilaiUTS.length - 1);

        double uasRata = rataUAS(nilaiUAS);

        System.out.println("Nilai UTS tertinggi  : " + utsMax);
        System.out.println("Nilai UTS terendah   : " + utsMin);
        System.out.println("Rata-rata nilai UAS  : " + uasRata);
    }
}