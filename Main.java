public class Main {

    public static void main(String[] args) {
        int sodong, socot;
        sodong = 4;
        socot = 4;
        String[][] array = new String[sodong][socot];
        for (int i =0; i < sodong; i++) {
            for (int j = 0; j < socot; j++) {
                array[i][j] = "* ";
            }
        }
// Bài 1
//        Gán vị trí của player
        array[2][2] = "P ";

//        In ra mảng hai chiều
        for(int i = 0; i < sodong; i++) {
            for (int j = 0; j < socot; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
