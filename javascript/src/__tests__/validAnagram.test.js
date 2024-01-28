const { validAnagram } = require('../validAnagram');

describe('Valid Anagram', () => {
  it('should return true if two strings are anagrams', () => {
    expect(validAnagram('anagram', 'nagaram')).toBeTruthy();
  })

  it('should return false if two strings are not anagrams.', () => {
    expect(validAnagram('rat', 'car')).toBeFalsy();
  })
});