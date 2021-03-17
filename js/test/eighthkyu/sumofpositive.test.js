const sumofpositive = require('../../eighthkyu/sumofpositive.js');

test('arr 1 2 3 4 5 sum is 15', () => {
    expect(sumofpositive([1,2,3,4,5])).toBe(15);
})

test('arr 1 -2 3 4 5 sum is 13', () => {
    expect(sumofpositive([1, -2,3,4,5])).toBe(13);
})

test('arr empty is 0', () => {
    expect(sumofpositive([])).toBe(0);
})

test('arr -1 -2 -3 -4 -5 sum is 0', () => {
    expect(sumofpositive([-1, -2,-3,-4,-5])).toBe(0);
})

test('arr -1 2 3 4 -5 sum is 9', () => {
    expect(sumofpositive([-1, 2,3,4,-5])).toBe(9);
})