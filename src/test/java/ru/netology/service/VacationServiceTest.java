package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationServiceTest {
    @ParameterizedTest
    @CsvSource({"3, 10000, 3000, 20000"
    })

    public void shouldCalculateThreeVacationMonths(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();

        int result = service.calcVacation(income, expenses, threshold);

        Assertions.assertEquals(expected, result);

    }

}

