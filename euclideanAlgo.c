#include <stdio.h>

int euc(long a, long b);

int main(void) {
    long a = 2324;
    long b = 56;
    printf("The GCD of %i and %i: %i",a , b, euc(a, b));

}

int euc(long a, long b) {
    if (a == 0 || b == 0) {
        return 0;
    }
    if (a % b != 0) {
        return euc(b, a % b);
    } else {
         return b;
    }
}