function checkMark(mark) {
    if (mark < 0 || mark > 100) {
        return "Invalid";
    } else {
        return "Valid";
    }
}

console.log(checkMark(-1));
console.log(checkMark(0));
console.log(checkMark(101));