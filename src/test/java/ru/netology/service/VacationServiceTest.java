package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTest {
    @ParameterizedTest
    @CsvFileSource(nullValues = {
            "10_000,3_000,20_000"
    })
    public int shouldCalculateThreeVacationMonths(int income, int expenses, int threshold, int expected) {
        VacationService service = new VacationService();
        int result = service.calcVacation(income, expenses, threshold);

        Assertions.assertEquals(expected, result);
        return expected;
    }
 


}

