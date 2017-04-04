class Value{
  constructor(){}


}

class BoolValue extends Value{
  constructor(private _value: boolean){
    super();
  }

  get value(){
    return this.value;
  }

  set value(value: boolean){
    this.value = value;
  }

  public toString():String{
    return this._value.toString();
  }
}

class CharValue extends Value{
  constructor(private _value: string){
    super();
  }

  get value(){
    return this.value;
  }

  set value(value: string){
    this.value = value;
  }

  public toString():String{
    return this._value.toString();
  }
}

function odd(b:Value):Value{
  if(b instanceof BoolValue){
    return 'a';
  }else{
    return false;
  }
}

var x:Value = [new CharValue('a'), new BoolValue(true), new CharValue('b')];

for(var val:Value of x){
  document.write(
    odd(val).toString()
     + ' '
  );
}

// document.write(odd(new BoolValue(true)).toString());
// document.write(odd(new CharValue('huhu')).toString());
