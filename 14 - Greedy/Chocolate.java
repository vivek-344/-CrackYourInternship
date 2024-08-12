import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Chocolate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            br.readLine();  // Skipping the first line as it’s not needed
            String[] temp = br.readLine().split(" ");
            int N = Integer.parseInt(temp[0]) - 1;  // Number of horizontal cuts
            int M = Integer.parseInt(temp[1]) - 1;  // Number of vertical cuts

            Integer[] hor = new Integer[N];
            Integer[] ver = new Integer[M];

            for (int i = 0; i < N; i++) {
                hor[i] = Integer.parseInt(br.readLine());
            }
            for (int i = 0; i < M; i++) {
                ver[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(hor, Collections.reverseOrder());
            Arrays.sort(ver, Collections.reverseOrder());

            int cost = 0, vertCut = 1, horCut = 1;
            int i = 0, j = 0;

            while (i < N && j < M) {
                if (hor[i] >= ver[j]) {
                    cost += hor[i] * vertCut;
                    horCut++;
                    i++;
                } else {
                    cost += ver[j] * horCut;
                    vertCut++;
                    j++;
                }
            }

            // Remaining cuts
            while (i < N) {
                cost += hor[i] * vertCut;
                i++;
            }
            while (j < M) {
                cost += ver[j] * horCut;
                j++;
            }

            System.out.println(cost);
        }
    }
}
