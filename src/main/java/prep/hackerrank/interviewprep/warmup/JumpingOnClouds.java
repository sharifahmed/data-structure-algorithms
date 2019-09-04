package prep.hackerrank.interviewprep.warmup;

/**
 * @author sharifahmed
 * @since 9/4/19
 */
public class JumpingOnClouds {

    private static final int SAFE = 0;
    private static final int DANGER = 1;

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 0}));
        System.out.println(jumpingOnClouds(new int[]{0, 1, 0, 0, 0, 1, 0}));
    }

    static int jumpingOnClouds(int[] c) {
        int inputSize = c.length;
        int[] path = new int[inputSize];

        for (int i = 0; i < inputSize; i++) {
            if (c[i] == DANGER) {
                continue;
            }
            if (i == inputSize - 1) {
                break;
            }
            if (i + 1 < inputSize && c[i + 1] == SAFE) {
                path[i + 1] = path[i + 1] != 0 && path[i + 1] < path[i] + 1 ? path[i + 1] : path[i] + 1;
            }
            if (i + 2 < inputSize && c[i + 2] == SAFE) {
                path[i + 2] = path[i + 2] != 0 && path[i + 2] < path[i] + 1 ? path[i + 2] : path[i] + 1;
            }
        }

        return path[inputSize - 1];
    }
}
