package org.example;

class L204 {
    //https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
    public int countPrimes(int n) {
        int res = 0;
        var used = new boolean[n];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!used[i - 1]) {
                int temp = i * i;
                while (temp < n) {
                    used[temp - 1] = true;
                    temp += i;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (!used[i - 1]) {
                res++;
            }
        }
        return res;
    }
}