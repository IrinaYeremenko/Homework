package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums = {13, 6, 1, 2, 3};
        System.out.println(firstLast6(nums));
        int[] a = {1, 2, 3}, b = {7, 3};
        System.out.println(commonEnd(a, b));
        int[] nums1 = {5, 11, 9};
        System.out.println(reverse3(nums1));
        int[] nums2 = {1, 1, 1, 2, 1};
        System.out.println(canBalance(nums2));
    }

    public static boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length - 1] == 6) ? true : false;
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) ? true : false;
    }

    public static int[] reverse3(int[] nums1) {
        int tmp = 0;
        for (int i = 0; i < nums1.length / 2; ++i) {
            tmp = nums1[i];
            nums1[i] = nums1[nums1.length - i - 1];
            nums1[nums1.length - i - 1] = tmp;
        }
        return nums1;
    }

    public static boolean canBalance(int[] nums2) {
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < nums2.length - 1; i++) {
            leftSum += nums2[i];
            rightSum = 0;
            for (int j = i + 1; j < nums2.length; j++) {
                rightSum += nums2[j];
            }
            if (leftSum == rightSum) return true;
        }
        return false;
    }
}
