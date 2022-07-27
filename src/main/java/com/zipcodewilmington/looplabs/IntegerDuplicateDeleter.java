package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        return Stream.of(array)
                .filter(num->numberOfOccurrence(num)<maxNumberOfDuplications).toArray(Integer[]::new);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Stream.of(array)
                .filter(num->numberOfOccurrence(num)!=exactNumberOfDuplications).toArray(Integer[]::new);
    }

    public Long numberOfOccurrence (Integer num) {
        return Stream.of(array)
                .filter(newNum -> newNum.equals(num)).count();
    }
}
