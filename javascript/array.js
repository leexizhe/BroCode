
/*JavaScript loop through an array*/
console.log("BroCode - String slicing in JavaScript");
let numbers = [1, 2, 3, 4, 5];

for (let number of numbers) {
    console.log("array number is ", number)
}

/*JavaScript spread operator*/
// spread operator = allows an iterable such as an  ... array or string to
// be expanded  in places where zero or more arguments are expected unpacks the elements)
console.log("BroCode - JavaScript spread operator");
let num = [10, 100, 100];
let maxNum = Math.max(...num);
let minNum = Math.min(...num);
console.log("max number is ", maxNum)
console.log("min number is ", minNum)

/*JavaScript rest parameters*/
// rest parameters = represents an indefinite number ... of parameters (packs arguments into an array)
console.log("BroCode - JavaScript rest parameters");
let a = 1;
let b = 2;
let c = 3;
let d = 4;
let e = 5;

console.log(sum(a, b, c, d, e));

function sum(...numbers){
    let total = 0;
    for(let number of numbers){
        total += number
    }
    return total
}

/*JavaScript callbacks*/
// callback = a function passed as an argument to another function.
console.log("BroCode - JavaScript callbacks");
sumTogether(2, 3, displayConsole);

function sumTogether(x, y, callBackFunction){
    let result = x + y;
    callBackFunction(result);
    callBackFunction(result);
}

function displayConsole(output){
    console.log(output);
}

/*JavaScript array.forEach()*/
//array.forEach() = executes a provided callback function once for each array element
console.log("JavaScript array.forEach()");
let students = ["spongebob", "patrick", "squidward"];
students.forEach(capitalize);

// forEach method provides 3 arguments - value, index, array
function capitalize(value, index, array){
    array[index] = value[0].toUpperCase() + value.substring(1);
    console.log(value);
}
