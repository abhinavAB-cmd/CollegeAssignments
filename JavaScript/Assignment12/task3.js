function calculate(op, a, b) {
    switch (op) {
        case "+":
            return a + b;

        case "-":
            return a - b;

        case "*":
            return a * b;

        case "/":
            return a / b;
    }
}

console.log(calculate("-", 9, 4));
console.log(calculate("*", 3, 3));