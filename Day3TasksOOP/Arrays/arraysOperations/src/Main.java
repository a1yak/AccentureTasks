public class Main {
    public static void main(String[] args) {

        int table[][] = new int[10][10];
        for(int i = 0; i<10; i++)
        {
            for(int j=0 ;j<10; j++){
                table[i][j] = i*j;
            }
        }
        printTable(table);
        System.out.println("\nCopied array: ");
        printTable(copyArray(table));
    }

    static void printTable(int[][] table){
        for(int i = 0; i<10; i++)
        {
            System.out.println("");
            for(int j=0; j<10; j++){
                System.out.print(table[i][j]+" ");
            }
        }
    }
    
    static int[][] copyArray(int [][] arr){
        int [][]coppied = new int[10][10];
        for(int i = 0; i<10; i++)
        {
            for(int j=0; j<10; j++){
                coppied[i][j]=arr[i][j];
            }
        }
        return coppied;
    }
}