/*JavaScript setTimeout()*/
console.log("BroCode - JavaScript setTimeout()");
// setTimeout() = invokes a function after a number of milliseconds
// asynchronous function (doesn't pause execution)

let item = "cryptocurrency";
let price = 420.69;

let timer1 = setTimeout(firstMessage, 3000, item, price);
let timer2 = setTimeout(secondMessage, 6000);
let timer3 = setTimeout(thirdMessage, 9000);

function firstMessage(item, price) {
    alert(`Buy this ${item} for $${price}`);
}

function secondMessage() {
    alert(`This is not a scam!`);
}

function thirdMessage() {
    alert(`DO ITT!`);
}

document.getElementById("myButton").onclick = function () {
    clearTimeout(timer1);
    clearTimeout(timer2);
    clearTimeout(timer3);
    alert(`Thanks for buying!`);
}


/*JavaScript setInterval()*/
console.log("BroCode - JavaScript setInterval()");
// setInterval() = invokes a function repeatedly after no. of milliseconds asynchronous function (doesn't pause execution)
document.getElementById("countdownButton").onclick = function () {
    let count = 0;
    let max = Number(document.getElementById("countdown").value);
    const myTimer = setInterval(countUp, 1000);

    function countUp() {
        count += 1;
        document.getElementById("countLabel").innerHTML = count;
        if (count >= max) {
            clearInterval(myTimer);
        }
    }
};


/*JavaScript clock program*/
console.log("BroCode - JavaScript clock program");
const time = document.getElementById("time");

setInterval(update, 1000);

function update() {
    let date = new Date();

    time.innerHTML = formatDate(date);

    function formatDate(date) {
        let hours = date.getHours();
        let minutes = date.getMinutes();
        let seconds = date.getSeconds();
        let clock12 = hours >= 12 ? "pm" : "am";

        hours = (hours % 12) || 12;

        hours = formatZeros(hours);
        minutes = formatZeros(minutes);
        seconds = formatZeros(seconds);

        return `${hours}:${minutes}:${seconds} ${clock12}`;
    }

    function formatZeros(time) {
        time = time.toString();
        return time.length < 2 ? "0" + time : time;
    }
}


/*JavaScript asynchronous*/
console.log("BroCode - JavaScript asynchronous");
// synchronous code = In an ordered sequence. Step-by-step linear instructions (start now, finish now)
// asynchronous code = Out of sequence. Ex. Access a database Fetch a file Tasks that take time (start now, finish sometime later) synchronous

console.log("START");

// asynchronous
setTimeout(() => console.log("This is asynchronous"), 5000);
// synchronous
console.log("Hello World!");

console.log("END");


/*JavaScript console.time()*/
console.log("BroCode - JavaScript console.time()");
// console.time() = Starts a timer you can use to track how long an operation takes Give each timer a unique name.
//start
console.time("Response time");

console.log("Hello World!");
//setTimeout(() => console.log("HELLO!"), 3000);

//end
console.timeEnd("Response time");


/*JavaScript promises*/
console.log("BroCode - JavaScript promises");
// promise = object that encapsulates the result of an asynchronous operation let asynchronous
// methods return values like synchronous methods "I promise to return something in the future"
// async = makes a function return a Promise
// await = makes a function wait for a Promise

let fileLoaded = true;

const promise = new Promise((resolve, reject) => {
    if(fileLoaded){
        resolve("File loaded");
    }
    else{
        reject("File NOT loaded");
    }
});

promise.then(value => console.log(value))
    .catch(error => console.log(error));
