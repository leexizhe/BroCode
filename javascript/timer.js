const timeDisplay = document.querySelector("#timeDisplay");
const startBtn = document.querySelector("#startBtn");
const pauseBtn = document.querySelector("#pauseBtn");
const resetBtn = document.querySelector("#resetBtn");


let startTime = 0;
let elapsedTime = 0;
let paused = true;
let intervalId;
let secs = 0;
let mins = 0;
let hrs = 0;

startBtn.addEventListener("click", () => {
    if (paused) {
        paused = false;
        startTime = Date.now() - elapsedTime;
        intervalId = setInterval(updateTime, 1000);
    }

});

pauseBtn.addEventListener("click", () => {
    if (!paused) {
        paused = true;
        elapsedTime = Date.now() - startTime;
        clearInterval(intervalId);
    }
});
resetBtn.addEventListener("click", () => {

    startTime = 0;
    elapsedTime = 0;
    paused = true;
    secs = 0;
    mins = 0;
    hrs = 0;
    timeDisplay.textContent = "00:00:00";
    clearInterval(intervalId);
});
function updateTime() {
    elapsedTime = Date.now() - startTime;
    secs = Math.floor((elapsedTime / 1000) % 60);
    mins = Math.floor((elapsedTime / (1000 * 60)) % 60);
    hrs = Math.floor((elapsedTime / (1000 * 60 * 60)) % 24);

    secs = doubleDigit(secs);
    mins = doubleDigit(mins);
    hrs = doubleDigit(hrs);

    timeDisplay.textContent = `${hrs}:${mins}:${secs}`;

    function doubleDigit(unit) {
        return unit.length > 2 ? unit : "0" + unit;
    }
}
