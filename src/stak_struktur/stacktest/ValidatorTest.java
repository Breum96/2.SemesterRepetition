package stak_struktur.stacktest;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import stak_struktur.stack.Validator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidatorTest {
    @Test
    @Order(1)
    void test_stack_valistaeStack(){
        //arrange
        String lovlig = "(3+{5{99{*}}[23[{67}67]]})";
        String ulovlig = "(}){";
        String ulovlig2 = "[[[}}}";

        // acts
        boolean lovligfFaktisk = Validator.validateBrackets(lovlig);
        boolean ulovligFaktisk = Validator.validateBrackets(ulovlig);
        boolean Ulovlig2Faktisk = Validator.validateBrackets(ulovlig2);

        // asserts

        assertTrue(lovligfFaktisk);

        assertFalse(ulovligFaktisk);

        assertFalse(Ulovlig2Faktisk);


    }
}
