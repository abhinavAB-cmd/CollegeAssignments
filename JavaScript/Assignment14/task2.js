function calculateBmi(weight, height) {
    let bmi = weight / (height * height);

    return Math.round(bmi * 10) / 10;
}

console.log(calculateBmi(70, 1.75));