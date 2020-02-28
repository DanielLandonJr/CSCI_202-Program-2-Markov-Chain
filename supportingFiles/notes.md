# notes for amtrix application

## copy

- ```this._data = Arrays.stream(_newMatrix._data).map(_tempItem ->  Arrays.copyOf(_tempItem, _tempItem.length)).toArray(int[][]::new);```

## equals

- ```boolean _testCondition = false;```
- ```_testCondition =  Arrays.equals(this._data, _testMatrix._data) ?  true : false;```

