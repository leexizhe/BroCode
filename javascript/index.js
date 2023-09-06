console.log("hello world");

/* window */
// window.alert("Hello World")


/*  Variables and data types in JavaScript
    1. Declaration (var, let, const)
    2. Assignment  (= assignment operator) */

let firstName = "Bro"; //strings
let age = 21; //number
let student = true; //booleans

console.log("Hello", firstName);
console.log("You are", age, "years old");
console.log("Enrolled:", student);

/*  getElementById then pass into html */
document.getElementById("p1").innerHTML = "Hello " + firstName;
document.getElementById("p2").innerHTML = "You are " + age + " years old";
document.getElementById("p3").innerHTML = "Enrolled: " + student;


/*JavaScript ES6 Modules*/
import * as MathUtil from "./MathUtil.js";

console.log(MathUtil.PI);

let circumference = MathUtil.getCircumference(10);
console.log(circumference);

let area = MathUtil.getArea(10);
console.log(area);