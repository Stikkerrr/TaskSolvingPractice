const eod = require('../../kata8/evenorodd.js');

test('2 is even', () => {
    expect(eod(2)).toBe('Even');
})

test('0 is even', () => {
    expect(eod(0)).toBe('Even');
})

test('7 is odd', () => {
    expect(eod(7)).toBe('Odd');
})

test('1 is odd', () => {
    expect(eod(1)).toBe('Odd');
})