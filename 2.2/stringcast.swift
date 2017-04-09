
func kk(){
  var array: Array<Any> = []
  let element: [AnyObject] = [ ]
  array.append(element)
  let huhu:String  = array[0]
}
kk()

/*


https://iswift.org/playground?UlcYhX
Swift:: Error: cannot convert value of type 'Any' to specified type 'String'
  let huhu:String  = array[0]
                     ~~~~~^~~
                              as! String
 
*/
