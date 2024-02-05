/*
Given an array of integers nums and an integer target, return indices 
of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, 
and you may not use the same element twice.

You can return the answer in any order.
*/

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
function twoSum(numList, target) {
  const matches = {};

  for (const [i, n] of numList.entries()) {
    const matchingNum = target - n;

    if (matches[n] !== undefined) {
      return [matches[n], i]
    } else {
      matches[matchingNum] = i;
    }
  }

  return []
}

module.exports = { twoSum }