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
numbers = [10, 100, 100];
let maxNum = Math.max(...numbers);
let minNum = Math.min(...numbers);
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

function sum(...numbers) {
    let total = 0;
    for (let number of numbers) {
        total += number
    }
    return total
}


/*JavaScript callbacks*/
// callback = a function passed as an argument to another function.
console.log("BroCode - JavaScript callbacks");
sumTogether(2, 3, displayConsole);

function sumTogether(x, y, callBackFunction) {
    let result = x + y;
    callBackFunction(result);
    callBackFunction(result);
}

function displayConsole(output) {
    console.log(output);
}


/*JavaScript array.forEach()*/
//array.forEach() = executes a provided callback function once for each array element
console.log("JavaScript array.forEach()");
let students = ["spongebob", "patrick", "squidward"];
students.forEach(capitalize);

// forEach method provides 3 arguments - value, index, array
function capitalize(element, index, array) {
    array[index] = element[0].toUpperCase() + element.substring(1);
    console.log(element);
}


/*JavaScript array.map()*/
//array.map() = executes a provided callback function once for each array element AND creates a new array
console.log("JavaScript array.map()");
numbers = [1, 2, 3, 4, 5, 6];
let squares = numbers.map(square);
let cubes = numbers.map(cube);

console.log(`numbers: ${numbers}`);
console.log(`squares: ${squares}`);
console.log(`cubes: ${cubes}`);

function square(element) {
    return Math.pow(element, 2);
}

function cube(element) {
    return Math.pow(element, 3);
}


/*JavaScript array.filter()*/
//array.filter() = creates a new array with all elements that pass the test provided by a function
console.log("JavaScript array.filter()");
numbers = [1, 2, 3, 10, 100, 1000, 200];
console.log(`before filter: ${numbers}`);
numbers = numbers.filter(checkNum);

console.log(`after filter: ${numbers}`);

function checkNum(element) {
    return element >= 18;
}


/*JavaScript array.reduce()*/
//array.reduce() = reduces an array to a single value
console.log("JavaScript array.reduce()");
numbers = [5, 10, 15, 20, 25, 30];
let total = numbers.reduce(checkOut);

console.log(`The total is: ${total}`);

function checkOut(total, element) {
    return total + element;
}


/*JavaScript sort an array of numbers*/
console.log("JavaScript sort an array of numbers");
numbers = [100, 50, 90, 60, 80, 70];

numbers = numbers.sort(descendingSort);
console.log(numbers);

numbers = numbers.sort(ascendingSort);
console.log(numbers);

function descendingSort(x, y) {
    return y - x;
}

function ascendingSort(x, y) {
    return x - y;
}