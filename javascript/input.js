/*User input in JavaScript*/

let username;

document.getElementById("nameButton").onclick = function () {

    username = document.getElementById("name").value;
    window.alert("hello " + username);
}

/*Type conversion in JavaScript*/
let age;

document.getElementById("ageButton").onclick = function () {

    age = document.getElementById("age").value;
    age = Number(age) + 1;
    console.log("your age is ", age);
}

/*Hypotenuse calculator practice program in JavaScript*/
let a;
let b;
let c;

document.getElementById("calculatorButton").onclick = function () {

    a = document.getElementById("aText").value;
    b = document.getElementById("bText").value;

    c = Math.sqrt(Math.pow(Number(a), 2) + Math.pow(Number(b), 2))

    document.getElementById("cLabel").innerHTML = "Side C: " + c;
}

/*Counter program in JavaScript*/
let count = 0;

document.getElementById("decrease").onclick = function () {
    count -= 1;
    document.getElementById("countLabel").innerHTML = count;
};

document.getElementById("increase").onclick = function () {
    count += 1;
    document.getElementById("countLabel").innerHTML = count;
};

document.getElementById("reset").onclick = function () {
    count = 0;
    document.getElementById("countLabel").innerHTML = count;
};

/*JavaScript checked property*/
document.getElementById("checkedButton").onclick = function () {
    const myCheckBox = document.getElementById("myCheckedBox");
    const dota = document.getElementById("dotaBtn");
    const lol = document.getElementById("lolBtn");

    if (myCheckBox.checked && dota.checked) {
        window.alert("You are Dota gamer!");
    } else if (myCheckBox.checked && lol.checked) {
        window.alert("You are LoL gamer!");
    } else if (myCheckBox.checked) {
        window.alert("You are normal gamer!");
    } else {
        window.alert("LOSER!");
    }
};