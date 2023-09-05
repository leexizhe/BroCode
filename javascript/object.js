
/*JavaScript objects*/
// object = A group of properties and methods properties = what an object has methods =
// what an object can do use . to access properties/methods
console.log("BroCode - JavaScript objects");
const car1 = {
    model:"Mustang",
    color:"red",
    year:2023,

    drive : function(){
        console.log("You drive the car");
    },
    brake : function(){
        console.log("You step on the brakes");
    }
}
console.log(car1.model);

console.log(car1.color);
console.log(car1.year);
car1.drive();
car1.brake();


/*JavaScript this keyword*/
// this = reference to a particular object the object depends on the immediate context
console.log("BroCode - JavaScript this keyword");
const car2 = {
    model:"Mustang",
    color:"red",
    year:2023,

    drive : function(){
        console.log(`You drive the ${this.model}`);
    }
}

const car3 = {
    model:"Corvette",
    color:"blue",
    year:2024,

    drive : function(){
        console.log(`You drive the ${this.model}`);
    }
}
car2.drive();

car3.drive();


/*JavaScript classes*/
console.log("BroCode - JavaScript classes");
// class = a blueprint for creating objects define what properties and
// methods they have use a constructor for unique properties
class Player{

    score = 0;

    pause(){
        console.log("You paused the game");
    }
    exit(){
        console.log("You exited the game");
    }
}
const player1 = new Player();

const player2 = new Player();
player1.score += 1;

console.log("player 1 score: ", player1.score);

console.log("player 2 score: ", player2.score);
player1.pause();

player2.exit();


/*JavaScript constructors*/
console.log("BroCode - JavaScript constructors");
// constructor = a special method of a class, accepts arguments and assigns properties
class Student{

    constructor(name, activity){
        this.name = name;
        this.activity = activity;
    }
    action(){
        console.log(`${this.name} is ${this.activity}`);
    }
}

const student1 = new Student("Spongebob","studying");

const student2 = new Student("Patrick", "sleeping");
const student3 = new Student("Sandy", "eating");
student1.action();

student2.action();
student3.action();

/*JavaScript static*/
console.log("BroCode - JavaScript static");
// static = belongs to the class, not the objects
// properties: useful for caches, fixed-configuration
// methods:    useful for utility functions
class Car{

    static numberOfCars = 0;

    constructor(model){
        this.model = model;
        Car.numberOfCars += 1;
    }
    static startRace(){
        console.log("3...2...1...GO!");
    }
}

const car4 = new Car("Mustang");
const car5 = new Car("Corvette");
const car6 = new Car("BMW");
console.log(Car.numberOfCars);

Car.startRace();


/*JavaScript inheritance*/
console.log("BroCode - JavaScript inheritance");
// inheritance = a child class can inherit all the methods and properties from another class
class Animal{
    alive = true;
    eat(){
        console.log(`This ${this.name} is eating`);
    }
    sleep(){
        console.log(`This ${this.name} is sleeping`);
    }
    constructor(name){
        this.name = name;
    }
}

class Rabbit extends Animal{
    name = "rabbit";
    run(){
        console.log(`This ${this.name} is running`);
    }
}

class Fish extends Animal{
    name = "fish";
    swim(){
        console.log(`This ${this.name} is swimming`);
    }
}
const rabbit = new Rabbit();

const fish = new Fish();
console.log(rabbit.alive);

rabbit.eat();
rabbit.sleep();
rabbit.run();
console.log(fish.alive);
fish.eat();
fish.sleep();
fish.swim();


/*JavaScript super keyword*/
console.log("BroCode - JavaScript super keyword");
// super = Refers to the parent class. Commonly used to invoke constructor of a parent class

class Hawk extends Animal{

    constructor(name, flySpeed){
        super(name);
        this.flySpeed = flySpeed;
    }
}

const hawk = new Hawk("hawk",  200);

console.log(hawk.name);
console.log(hawk.flySpeed);


/*JavaScript getters & setters*/
console.log("BroCode - JavaScript getters & setters");
// get = binds an object property to a function when that property is accessed
// set = binds an object property to a function when that property is assigned a value

class Motorbike{
    constructor(power){
        this._gas = 25;
        this._power = power;
    }
    get power(){
        return `${this._power}hp`;
    }
    get gas(){
        return `${this._gas}L (${this._gas / 50 * 100}%)`;
    }
    set gas(value){
        if(value > 50){
            value = 50;
        }
        else if(value < 0){
            value = 0;
        }
        this._gas = value;
    }
}

let motorbike = new Motorbike(400);

motorbike.gas = 100;

console.log(motorbike.power);
console.log(motorbike.gas);