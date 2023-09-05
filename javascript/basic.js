/*Useful string methods in JavaScript*/
console.log("BroCode - Useful string methods in JavaScript");
let userName = "Bro Code   ";
let phoneNumber = "123-456-7890";

console.log("length:", userName.length);
console.log(userName.charAt(0));
console.log("first o:", userName.indexOf("o"));
console.log("last o:", userName.lastIndexOf("o"));
userName = userName.trim();
console.log("length:", userName.length);
userName = userName.toUpperCase();
console.log("uppercase:", userName);
userName = userName.toLowerCase();
console.log("lowercase:", userName);

phoneNumber = phoneNumber.replaceAll("-", "");
console.log(phoneNumber);

/*String slicing in JavaScript*/
console.log("BroCode - String slicing in JavaScript");
let fullName = "Snoop Dogg";
let firstName;
let lastName;
firstName = fullName.slice(0, fullName.indexOf(" "));

lastName = fullName.slice(fullName.indexOf(" ") + 1);
console.log(firstName);

console.log(lastName);

/*JavaScript function expressions*/
// function expression = function without a name (anonymous function) avoid polluting the global scope with names write it, then forget about it
console.log("BroCode - JavaScript function expressions");
const greeting = function () {

    console.log("hello");
}
greeting();
let count = 0;

document.getElementById("increaseButton").onclick = function () {

    count += 1;
    document.getElementById("myLabel").innerHTML = count;
}
document.getElementById("decreaseButton").onclick = function () {
    count -= 1;
    document.getElementById("myLabel").innerHTML = count;
}

/*JavaScript arrow function expressions*/
console.log("BroCode - JavaScript arrow function expressions");
const hello = (userName) => console.log(`Hello ${userName}`)

hello("world");

const percent = (x, y) => x / y * 100;
console.log(`${percent(1, 10)}%`)