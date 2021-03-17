const multiply = require('../../eighthkyu/multiply.js');

test('2 times 2 equals 4', () => {
    expect(multiply(2,2)).toBe(4);
})

test('1 times 2 equals 2', () => {
    expect(multiply(1, 2)).toBe(2);
})

test('2 times 3 equals 6', () => {
    expect(multiply(2,3)).toBe(6);
})

