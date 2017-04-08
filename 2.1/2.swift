
func kk(){
  let array: Array<Int> = []
  let element: Int = 1
  array.append(element)
}
kk()
/*
https://iswift.org/playground:
Swift:: Error: cannot use mutating member on immutable value: 'array' is a 'let'
 constant
  array.append(element)
  ^~~~~
tmp/a5A9RXHmjZ.swift:4:3: note: change 'let' to 'var' to make it mutable
  let array: Array<Int> = []
  ^~~
  var

*/
