/*
    Variables -
        let -
        const -
        var -  scope problem it will be Global or function scope - var has no block scope
        install - live server

*/

//declaration + assignment
let message = "welcome to JS"
var city="Pune";
console.log(message);
let a=10,
b=20,
c=30;
console.log(a," ",b," ",c)

//main property
message="Good to be here!!"
console.log(message);

//creating constant in javascript
 const user="JavaScript"
 console.log(user);

//  user="Re assignment of values"
if(4>2){
    console.log("inside block");
    let address="Mumbai";
    console.log(address);
    console.log(city);
}
console.log(city);

//var tolerates redeclaration
var x=10;
var x=100;
console.log(x);

//var variable can be declared below their use
z=20;
console.log("value of z is ",z);
var z;

/*
    naming rule:
    1. alphabet but it cannot start with digits
    2. name must contains only letters, digits, or symbols $ and _
    3. keywords cannot be used a variable name
    4. case sensitive
*/