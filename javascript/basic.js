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