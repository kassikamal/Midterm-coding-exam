package math.problems;

public class FindLowestDifference {
    static int FindLowestDifference(int A[]; int B[];
                                    int m, int n)
    {
        int a = 0, b = 0;
        int result = Integer.MAX_VALUE;

        while (a < m && b < n)
        {
            if (Math.abs(A[a] - B[b]) < result)
                result = Math.abs(A[a] - B[b]);

            if (A[a] < B[b])
                a++;

            else
                b++;
        }
        return result;
    }
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int A[]; array1 = {30,12,5,9,2,20,33,1};
        int B[]; array2 = {18,25,41,47,17,36,14,19};

        int m = A.length;
        int n = B.length;
        System.out.println(FindLowestDifference
                (A, B, m, n));



    }

}
