public class ArrayExample3 {
    public static void main(String[] args) {
        // ２次元配列
        // int [][] scores;
        // scores = new int[3][5];
        // scores[0][0] = 10;
        // scores[0][1] = 20;
        // scores[2][4] = 100;

        int [][] scores = {
            {50, 55, 70, 65, 80, 90},   // [0]2026年度のAさんの成績
            {60, 77, 90, 73, 55, 95},   // [1]2025年度のAさんの成績
            {66, 85, 76, 95, 98, 100}    // [2]2024年度のAさんの成績
        };

        System.out.println(scores.length);
        System.out.println(scores[0].length);

        for(int i = 0; i < scores.length; i++) {
            for(int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
