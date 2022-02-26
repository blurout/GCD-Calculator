package main

import(
	"fmt"
)

func main() {
    var a int64
	var b int64 
	a = 2324;
    b = 56;
    fmt.Print("The GCD of ", a, " and ", b, ": ", euc(a, b))
}

func euc(a int64, b int64) int64 {
    if a == 0 || b == 0 {
        return 0;
    }
    if a % b != 0 {
        return euc(b, a % b)
    } else {
         return b;
    }
}