
const { groupAnagrams } = require('../groupAnagrams');

describe('groupAnagrams', () => {
  it('should return a list of lists of anagrams', () => {
    const anagrams = groupAnagrams(["eat","tea","tan","ate","nat","bat"])
    anagrams.sort((a1, a2) => a1.length > a2.length ? 1 : -1);
    const expected = [["bat"],["nat","tan"],["ate","eat","tea"]];
    expected.sort((a1, a2) => a1.length > a2.length ? 1 : -1);

    anagrams.forEach((v, i) => {
      expect(v).toIncludeAllMembers(expected[i])
    });
  });

  it('should return a list of a list with empty string if input is empty string' ,() => {
    expect(groupAnagrams([""])).toEqual([[""]]);
  });

  it('should return a list of a list of single string if input is a single string', () => {
    expect(groupAnagrams(["a"])).toEqual([["a"]]);
  })
});