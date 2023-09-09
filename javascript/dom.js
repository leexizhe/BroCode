/*JavaScript DOM intro*/
console.log("BroCode - JavaScript DOM intro");
// DOM = Document Object Model - an interface to change the content of a page
console.log(document.title);

console.log(document.URL);
document.title = "Bro Code is the best!"

console.log(document.title);
document.body.style.backgroundColor = "lightgrey"


/*JavaScript element selectors*/
console.log("BroCode - JavaScript element selectors");
let fruits = document.getElementsByName("fruits");

console.log(fruits[0].value);
fruits.forEach(fruit => {
    if (fruit.checked) {
        console.log(fruit.value);
    }
})
let vegetables = document.getElementsByTagName("li");


vegetables[0].style.backgroundColor = "lightgreen";
vegetables[1].style.backgroundColor = "red";
vegetables[2].style.backgroundColor = "lightblue";
let desserts = document.getElementsByClassName("desserts");

desserts[0].style.backgroundColor = "lightgreen";
desserts[1].style.backgroundColor = "red";
desserts[2].style.backgroundColor = "lightblue";

// queryselector("#id")
// queryselector(".classname")
// queryselector("tagename")
let elements = document.querySelectorAll("li");
elements[1].style.backgroundColor = "red";
elements[2].style.backgroundColor = "lightblue";
let classes = document.querySelectorAll(".desserts");

classes[1].style.backgroundColor = "red";
classes[2].style.backgroundColor = "lightblue";


/*JavaScript DOM traversal*/
console.log("BroCode - JavaScript DOM traversal");
// .firstElementChild
// .lastElementChild
// .parentElement
// .nextElementSibling
// .previousElementSibling
// .children[]
// Array.from(.children)


/*JavaScript add/change HTML elements*/
console.log("BroCode - JavaScript add/change HTML elements");
// add/change HTML elements
// .innerHTML (vulnerable to XSS attacks)
// .textContent (more secure)
const nameTag = document.createElement("h1");

nameTag.textContent = "Bro";
document.body.append(nameTag);
const myList = document.querySelector("#vege");

const listItem = document.createElement("li");
listItem.textContent = "mango";
// myList.append(listItem);
// myList.prepend(listItem);
myList.insertBefore(listItem, myList.getElementsByTagName("li")[1]);


/*JavaScript events*/
console.log("BroCode - JavaScript events");
const button = document.getElementById("myButton");
button.onclick = doSomething;
const loading = document.body;


loading.onload = doSomething;
const box = document.getElementById("myDiv");


box.onmouseover = changeRed;
box.onmouseout = changeBlue;
// box.onmousedown = changeRed;
// box.onmouseup = changeBlue;
function doSomething() {

    alert("You did something!");
}

function changeRed() {

    box.style.backgroundColor = "red";
}

function changeBlue() {
    box.style.backgroundColor = "blue";
}


/*JavaScript addEventListener()*/
console.log("BroCode - JavaScript addEventListener()");
// .addEventListener(event, function, useCapture) You can add many event handlers
// to one element. Even the same event that invokes different functions
const innerDiv = document.getElementById("innerDiv");
const outerDiv = document.getElementById("outerDiv");

innerDiv.addEventListener("click", changeGreen);
outerDiv.addEventListener("click", changeGreen, true);

function changeGreen() {
    alert(`You selected ${this.id}`);
    this.style.backgroundColor = "lightgreen"
}


/*JavaScript show/hide HTML elements*/
console.log("BroCode - JavaScript show/hide HTML elements");
const toggle = document.querySelector("#toggle");
const duckoo = document.querySelector("#duckoo");
toggle.addEventListener("click", () => {

    if (duckoo.style.visibility == "visible") {
        duckoo.style.visibility = "hidden";
    } else {
        duckoo.style.visibility = "visible";
    }
})


/*JavaScript detect key presses*/
console.log("BroCode - JavaScript detect key presses");
const move = document.getElementById("move");
window.addEventListener("keydown", moving);
let x = 0;
let y = 0;

function moving(event) {

    switch (event.key) {
        case "ArrowDown":
            y += 5;
            move.style.top = y + "px";
            break;
        case "ArrowUp":
            y -= 5;
            move.style.top = y + "px";
            break;
        case "ArrowRight":
            x += 5;
            move.style.left = x + "px";
            break;
        case "ArrowLeft":
            x -= 5;
            move.style.left = x + "px";
            break;
        default:
            break;
    }

}


/*JavaScript animations*/
console.log("BroCode - JavaScript animations");
const animationBtn = document.getElementById("animationBtn");
const animation = document.getElementById("animation");


animationBtn.addEventListener("click", rotate);

function rotate() {
    let timerId = null;
    let degrees = 0;
    let x = 0;
    let y = 0;

    timerId = setInterval(frame, 5);

    function frame() {
        if (y >= 2000) {
            clearInterval(timerId);
        } else {
            x += 2;
            y += 2;
            degrees += 5;
            animation.style.left = x + "px";
            animation.style.bottom = y + "px";
            animation.style.transform = "rotateZ(" + degrees + "deg)";
        }
    }
}