/*
An Anagram is a word or phrase formed by rearranging the 
letters of a different word or phrase, typically using 
all the original letters exactly once.
*/

/**
 * @param {string} s1
 * @param {string} s2
 * @return {boolean}
 */
function validAnagram(s1, s2) {
  const charCount = {};
  for (const c of s1) {
    if (charCount[c]) {
      charCount[c] = charCount[c] + 1;
    } else {
      charCount[c] = 1;
    }
  }

  for (const c of s2) {
    if (charCount[c] > 0) {
      charCount[c] = charCount[c] - 1;
    } else if (!charCount[c] || charCount[c] === 0) {
      return false;
    }
  }

  return true;
}

module.exports = { validAnagram }