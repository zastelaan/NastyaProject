package ua.edu.npu.lab01.task01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Statistic {
    private String name;
    private ArrayList<Integer> results = new ArrayList<Integer>();

    public Statistic(String name, int[] results) {
        this.setName(name);

        for (int result : results) {
            this.results.add(result);
        }
    }

    public void addSomeValue(int value) {
        this.results.add(value);
    }

    public int getNumberOfResults() {
        return results.size();
    }

    public int getTotalSumOfResults() {
        int sum = 0;
        for (int result : results) {
            sum += result;
        }
        return sum;
    }

    public Integer[] convertArrListToArr() {
        Integer[] resultsArr = new Integer[results.size()];
        resultsArr = results.toArray(resultsArr);

        return resultsArr;
    }

    public int getMaxResult() {
        return Collections.max(results);
    }

    public int getMinResult() {
        return Collections.min(results);
    }

    public BigDecimal getAverageResult() {
        int sum = getTotalSumOfResults();
        int number = getNumberOfResults();

        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
    }

    public int getModeOfResults() {
        Integer[] resultsArr = this.convertArrListToArr();

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int max = 1;
        int temp = 0;

        for (Integer element : resultsArr) {

            if (hm.get(element) != null) {

                int count = hm.get(element);
                count++;
                hm.put(element, count);

                if (count > max) {
                    max = count;
                    temp = element;
                }
            } else {
                hm.put(element, 1);
            }
        }
        return temp;
    }

    public double getMedianOfResults() {
        Integer[] resultsArr = this.convertArrListToArr();

        Arrays.sort(resultsArr);
        double median;
        if (resultsArr.length % 2 == 0) {
            median = ((double) resultsArr[resultsArr.length / 2] + (double) resultsArr[resultsArr.length / 2 - 1]) / 2;
        } else {
            median = resultsArr[resultsArr.length / 2];
        }
        return median;
    }

    public int getNumOfResBiggerThanAver() {
        int num = 0;
        int average = this.getAverageResult().intValue();
        for (int result : results) {
            if (result > average) {
                num++;
            }
        }
        return num;
    }

    public int getNumOfResSmallerThanAver() {
        int num = 0;
        int average = this.getAverageResult().intValue();
        for (int result : results) {
            if (result < average) {
                num++;
            }
        }
        return num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        int[] results = { 10, 19, 7, 8, 10 };

        Statistic test = new Statistic("SomeName", results);

        test.addSomeValue(77);

        int max = test.getMaxResult();
        int min = test.getMinResult();
        System.out.println("Max/Min are " + max + " / " + min);

        BigDecimal average = test.getAverageResult();
        System.out.println("Average is " + average);

        int mode = test.getModeOfResults();
        if (mode == 0) {
            System.out.println("There is any mode in results!");
        } else {
            System.out.println("Mode is " + mode);
        }

        double median = test.getMedianOfResults();
        System.out.println("Median is " + median);

        int numOfResBiggerThanAver = test.getNumOfResBiggerThanAver();
        int numOfResSmallerThanAver = test.getNumOfResSmallerThanAver();
        System.out.println("Number of results bigger/smaller than average are " + numOfResBiggerThanAver + " / "
                + numOfResSmallerThanAver);
    }

}


