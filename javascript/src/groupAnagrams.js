/*
Given an array of strings strs, group the anagrams together. 
You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging 
the letters of a different word or phrase, typically using all 
the original letters exactly once.
*/

// O(m*nlogn)
/**
 * @param {string[]} strList
 * @return {string[][]}
 */
function groupAnagramsSort(strList) {
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

// O(m*n)
/**
 * @param {string[]} strList
 * @return {string[][]}
 */
function groupAnagrams(strList) {
  const countHashmap = {};

  strList.forEach((str) => {
    const charArr = new Array(26).fill(0);
    str.split("").forEach((_char, i) => {
      const charIndex = str.charCodeAt(i) - "a".charCodeAt(0);
      charArr[charIndex] += 1;
    })
    const charArrStr = charArr.join("");
    if (countHashmap[charArrStr]) {
      countHashmap[charArrStr] = [...countHashmap[charArrStr], str];
    } else {
      countHashmap[charArrStr] = [str];
    }
  })

  return Object.values(countHashmap);
}

module.exports = { groupAnagramsSort, groupAnagrams }