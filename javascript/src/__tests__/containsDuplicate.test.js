const { containsDuplicate } = require('../containsDuplicate');

describe('Contains Duplicate', () => {
  it('should return true if any value appears at least twice in the array', () => {
    expect(containsDuplicate([1, 2, 4, 5, 1])).toBeTruthy();
  })

  it('should return false if every element is distinct.', () => {
    expect(containsDuplicate([1, 2, 4, 5, 8])).toBeFalsy();
  })
});