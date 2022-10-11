package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L204Test {
    @Test
    public void countPrimes() {
        L204 countPrimes = new L204();

        assertEquals(4, countPrimes.countPrimes(10));
        assertEquals(0, countPrimes.countPrimes(1));
        assertEquals(0, countPrimes.countPrimes(2));
        assertEquals(1, countPrimes.countPrimes(3));

    }
}