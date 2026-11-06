function calculate(op, a, b) {
    if (op == "+") {
        return a + b;
    } else if (op == "-") {
        return a - b;
    } else if (op == "*") {
        return a * b;
    } else if (op == "/") {
        return a / b;
    }
}

console.log(calculate("+", 6, 2));
console.log(calculate("*", 6, 2));
console.log(calculate("/", 6, 2));