// var compName="Test"
// function scope

function test() {
    if (5 > 2) {
        var x = 128;
        console.log("value of x ", x);
    }
    console.log("outside block " + x);
}
test()

let x = 123;
console.log(x);
x = 672117;
console.log(x);
const y = 12;
console.log(y);
// y=15661;
// console.log(y);
//block scope

//Arrow function

function square(x) {
    return x * x;
}

const squareA = (x) => x * x;

console.log(square(3));
console.log(squareA(5));

