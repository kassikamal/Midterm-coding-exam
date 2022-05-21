package algorithm;
import org.junit.Assert;
public class UnitTestSorting {
    int[] selectionSort(int [] unsortedArray) {
        for (int i = 0; i < unsortedArray.length - 1; i++) {
            int index = i;

            for (int j = i + 1; j < unsortedArray.length; j++) {

                if (unsortedArray[j] < unsortedArray[index]) {
                    index = j;
                }
            }
            int smallerNumber = unsortedArray[index];
            unsortedArray[index] = unsortedArray[i];
            unsortedArray[i] = smallerNumber;
        }

        return unsortedArray;

    }

}

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};

        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray);
        }catch(Exception ex){
            ex.getMessage();
        }
        System.out.println("After Selection Sort");

        for(int i:sortedArray){

            System.out.print(i+" ");

        }

    }

    @Test
    public void checkIfDataSorted() {
        Sort sort = new Sort();
        int [] sortedArray;
        int [] unSortedArray;
        try {
            unSortedArray = new int []{1,5,4,8,2,6,9};
            sortedArray = sort.selectionSort(unSortedArray);
            System.out.println(assertArrayEquals(unSortedArray, sortedArray));
            unSortedArray = new int []{5,1,7,9,3,2,6};
            sortedArray = sort.selectionSort(unSortedArray);
            System.out.println(assertArrayEquals(unSortedArray, sortedArray));
        }catch (Exception ex){
    }

}
    }
}
