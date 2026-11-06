function bmiCategory(bmi) {
    if (bmi < 18.5) {
        return "Underweight";
    } else if (bmi < 25) {
        return "Normal";
    } else {
        return "Overweight";
    }
}

console.log(bmiCategory(22.9));