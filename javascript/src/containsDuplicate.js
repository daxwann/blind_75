/*
Given an integer array nums, return true if any value appears at least twice in the array, 
and return false if every element is distinct.
*/

/**
 * @param {number[]} numList
 * @return {boolean}
 */
function containsDuplicate(numList) {
  const numIndex = {};
  
  for (const n of numList) {
    if (numIndex[n]) return true;
    numIndex[n] = true;
  }

  return false;
}

module.exports = { containsDuplicate };
