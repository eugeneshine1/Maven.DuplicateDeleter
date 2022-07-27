package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        return Stream.of(array)
                .filter(str->numberOfOccurrence(str)<maxNumberOfDuplications).toArray(String[]::new);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Stream.of(array)
                .filter(str->numberOfOccurrence(str)!=exactNumberOfDuplications).toArray(String[]::new);
    }
    public Long numberOfOccurrence (String str) {
        return Stream.of(array)
                .filter(newStr -> newStr.equals(str)).count();
    }

}
