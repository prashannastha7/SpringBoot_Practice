package com.practise.spring.SpringProject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // duita beans huncha duita component cha soo only one can run so add primary to give more important
public class BubbleSortAlgo implements SortAlgo{
        public int[] sort(int[] numbers) {
            //Logic for Bubble
            return numbers;
        }
}
