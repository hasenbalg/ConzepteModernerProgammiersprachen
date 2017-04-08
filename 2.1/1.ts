var huhu = 0;
const hehe = "xx";

console.log(" var huhu:" + huhu); //0
console.log(" const hehe:" + hehe); // xx

function haha(){
	huhu = 1;
  console.log(" var huhu in einer function:" + huhu); //1
  hehe = "yy";  //ERROR Cannot assign to 'hehe' because it is a constant or a read-only property.
}
haha();


//const is not reassingable but not immutable

const hoho = {hihi:1};
console.log(hoho.hihi);//1
function h_h_(){
	hoho.hihi = 2;
  console.log(hoho.hihi); //2
}
h_h_();

//////////////////////////////////////////////////////////
var foo; //function scoped, backwards compartible
let bar; //bock scoped
const //cannot be reassigned

//let
var foo = "huhu";
console.log(foo); //huhu
function bar(){
  let foo = "haha";
  console.log(foo); //haha
}
bar();
console.log(foo); //huhu

//var
var foo = "huhu";
console.log(foo); //huhu
function baz(){
  foo = "haha";
  console.log(foo); //haha
}
baz();
console.log(foo); //haha
