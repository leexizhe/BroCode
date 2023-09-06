/*JavaScript DOM intro*/
console.log("BroCode - JavaScript DOM intro");
// DOM = Document Object Model - an interface to change the content of a page
console.log(document.title);

console.log(document.URL);
document.title = "Bro Code is the best!"

console.log(document.title);
document.body.style.backgroundColor="lightgrey"


/*JavaScript element selectors*/
console.log("BroCode - JavaScript element selectors");
let fruits = document.getElementsByName("fruits");

console.log(fruits[0].value);
fruits.forEach(fruit => {
    if(fruit.checked){
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
box.onmouseout  = changeBlue;
// box.onmousedown = changeRed;
// box.onmouseup = changeBlue;

function doSomething(){
    alert("You did something!");
}

function changeRed() {
    box.style.backgroundColor = "red";
}
function changeBlue() {
    box.style.backgroundColor = "blue";
}