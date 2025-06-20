package com.example;

public class App {

    public static void rotateRight(int[] nums, int k) {
        if (nums == null || nums.length == 0) return;

        int n = nums.length;
        k = k % n;  // se k > n, ruota modulo n

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    // Metodo helper per invertire un segmento dell'array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1; // nuova lunghezza dell'array senza duplicati
    }

    public static void main(String[] args) {

        // Bug: possibile NullPointerException
        String name = null;
        System.out.println(name.toLowerCase());

        // Duplicazione: due stampe identiche
        System.out.println("Duplicated line");
        System.out.println("Duplicated line");
    }
}
