/*User input in JavaScript*/

let username;

document.getElementById("nameButton").onclick = function(){

    username = document.getElementById("name").value;
    window.alert("hello "+ username);
}

/*Type conversion in JavaScript*/
let age;

document.getElementById("ageButton").onclick = function(){

    age = document.getElementById("age").value;
    age = Number(age)+ 1;
    console.log("your age is ", age);
}

/*Hypotenuse calculator practice program in JavaScript*/
let a;
let b;
let c;

document.getElementById("calculatorButton").onclick = function(){

    a = document.getElementById("aText").value;
    b = document.getElementById("bText").value;

    c = Math.sqrt(Math.pow(Number(a),2)+Math.pow(Number(b),2))

    document.getElementById("cLabel").innerHTML = "Side C: " + c;
}
