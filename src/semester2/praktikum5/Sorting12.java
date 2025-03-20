package semester2.praktikum5;

public class Sorting12 {
    int [] data;
    int jumData;

    Sorting12 (int Data[], int jmlDat) {
    jumData = jmlDat;
    data = new int[jmlDat];
    for (int i = 0; i < jumData; i++) {
        data[i] = Data[i];
        }
    }
    void bubbleSort(){
        int temp = 0;
        for (int i = 0; i < jumData-1; i++) {
            for (int j = 1; j < jumData-i; j++) {
                if (data[j-1]>data[j]) {
                    temp = data [j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                }
            }
        }
    }
    void SelectionSort(){
        for (int i = 0; i < jumData-1; i++) {
           int min = i;
           for (int j = i + 1; j < jumData; j++) {
                if (data[j]<data[min]) {
                    min=j;
                }
            }
            int temp=data[i];
            data[i]=data[min];
            data[min]=temp; 
        }
    }
    void insertionSort(){
        for (int i = 1; i < data.length; i++) {
           int temp=data[i];
           int j=i-1;
           while (j>=0 && data [j]>temp) {
                data[j+1]=data[j];
                j--;
           }
           data[j+1]=temp; 
        }
    }
    void tampil (){
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[]= {20, 10, 2, 7, 12};
        Sorting12 dataurut1 = new Sorting12(a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();
        
        int b[]= {30, 20, 2, 8, 14};
        Sorting12 dataurut2 = new Sorting12(b, b.length);

        System.out.println("data awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();

        int c[]= {40, 10, 4, 9, 3};
        Sorting12 dataurut3 = new Sorting12(c, c.length);

        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
    }
}
