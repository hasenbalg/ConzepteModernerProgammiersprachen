// Implementieren Sie eine Funktion in TypeScript, 
function huhu() {
  // die ein leeres Array von Zahlen erzeugt
    const array: number[] = [];
  
  //und anschließend ein Element
  const element: number = 0;

  // zu diesem Array hinzufugt.
  const array2 = array.push(element);
  
  return array2.length;
}
console.log(huhu());

// Verwenden Sie dabei nur nicht-ver ¨ ¨anderbare Variablen.
