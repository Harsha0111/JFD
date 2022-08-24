public class BinarySearch {
SortAlg sortAlg;
    public int binarySearch(int[] numbers, int numberToSearched) {
        SortAlg sortAlg = new BubbleSort();
        int[] sortedNumbers = sortAlg.sort(numbers);
        System.out.println(sortAlg);
        return 6;
    }
}
