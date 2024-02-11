/*
Given an array of strings strs, group the anagrams together. 
You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging 
the letters of a different word or phrase, typically using all 
the original letters exactly once.
*/

/**
 * @param {string[]} strList
 * @return {string[][]}
 */
function groupAnagrams(strList) {
  const sortedStrList = strList.reduce((prev, val, idx) => {
    return [...prev, val.split("").sort().join("")]
  }, []);

  const anagramMap = {};

  sortedStrList.forEach((sortedStr, index) => {
    if (anagramMap[sortedStr]) {
      anagramMap[sortedStr] = [...anagramMap[sortedStr], strList[index]];
    } else {
      anagramMap[sortedStr] = [strList[index]]
    }
  });

  return Object.values(anagramMap);
};

module.exports = { groupAnagrams }