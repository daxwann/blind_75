const { groupAnagram } = require('../groupAnagram');

describe('groupAnagram', () => {
  it('should return a list of lists of anagrams', () => {
    expect(groupAnagrams(["eat","tea","tan","ate","nat","bat"])).toEqual([["bat"],["nat","tan"],["ate","eat","tea"]]);
  });

  it('should return a list of a list with empty string if input is empty string' ,() => {
    expect(groupAnagram([""])).toEqual([[""]]);
  });

  it('should return a list of a list of single string if input is a single string', () => {
    expect(groupAnagram(["a"])).toEqual([["a"]]);
  })
});