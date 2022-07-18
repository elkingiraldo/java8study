package co.learn.java8.elkin.spotify;

import java.util.List;

public class GridSearch {
    /*
     * Complete the 'gridSearch' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING_ARRAY G
     *  2. STRING_ARRAY P
     */
    public static String gridSearch(List<String> G, List<String> P) {
        // Boundaries for knowing until which row and column, I loop through the G matrix
        int boundaryRows = G.size() - P.size();
        int boundaryColumns = G.get(0).length() - P.get(0).length();

        // If the P matrix is larger than G matrix, I can't find a match pattern
        if (boundaryRows < 0 || boundaryColumns < 0) {
            return "NO";
        }

        for (int i = 0; i <= boundaryRows; i++) {
            for (int j = 0; j <= boundaryColumns; j++) {
                // If the pattern is present in the current position [i, j], I try to match the entire P matrix
                if (P.get(0).equals(G.get(i).substring(j, j + P.get(0).length()))) {
                    if (sameMatrix(G, P, i, j)) {
                        return "YES";
                    }
                }
            }
        }

        return "NO";
    }

    private static boolean sameMatrix(List<String> G, List<String> P, int gRow, int gColumn) {
        // If I'm here, the first row was already matched,then I don't evaluate it twice.
        for (int i = 1; i < P.size(); i++) {
            String patternRow = P.get(i);
            String gridRow = G.get(gRow + i).substring(gColumn, gColumn + P.get(0).length());

            if (!patternRow.equals(gridRow)) {
                return false;
            }
        }

        return true;
    }
}
