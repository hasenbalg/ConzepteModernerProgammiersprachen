var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Value = (function () {
    function Value() {
    }
    return Value;
}());
var BoolValue = (function (_super) {
    __extends(BoolValue, _super);
    function BoolValue(_value) {
        var _this = _super.call(this) || this;
        _this._value = _value;
        return _this;
    }
    Object.defineProperty(BoolValue.prototype, "value", {
        get: function () {
            return this.value;
        },
        set: function (value) {
            this.value = value;
        },
        enumerable: true,
        configurable: true
    });
    BoolValue.prototype.toString = function () {
        return this._value.toString();
    };
    return BoolValue;
}(Value));
var CharValue = (function (_super) {
    __extends(CharValue, _super);
    function CharValue(_value) {
        var _this = _super.call(this) || this;
        _this._value = _value;
        return _this;
    }
    Object.defineProperty(CharValue.prototype, "value", {
        get: function () {
            return this.value;
        },
        set: function (value) {
            this.value = value;
        },
        enumerable: true,
        configurable: true
    });
    CharValue.prototype.toString = function () {
        return this._value.toString();
    };
    return CharValue;
}(Value));
function odd(b) {
    if (b instanceof BoolValue) {
        return 'a';
    }
    else {
        return false;
    }
}
var x = [new CharValue('a'), new BoolValue(true), new CharValue('b')];
for (var _i = 0, x_1 = x; _i < x_1.length; _i++) {
    var val = x_1[_i];
    document.write(odd(val).toString()
        + ' ');
}
// document.write(odd(new BoolValue(true)).toString());
// document.write(odd(new CharValue('huhu')).toString());
