package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import static org.junit.jupiter.api.Assertions.*;



class CalculatorTest {

    @Test
    public void testAdd() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        k = k % nums.length;

        int count = 0;

        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while(start != current);
        }


        Calculator calculator = new Calculator();
        int result = calculator.add(2, 2);

        assertEquals(result, 4);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(4, 2);

        assertEquals(0, result);
    }

}