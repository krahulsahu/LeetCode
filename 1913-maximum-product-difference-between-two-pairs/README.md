<h2><a href="https://leetcode.com/problems/maximum-product-difference-between-two-pairs/">1913. Maximum Product Difference Between Two Pairs</a></h2><h3>Easy</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">The <strong style="user-select: auto;">product difference</strong> between two pairs <code style="user-select: auto;">(a, b)</code> and <code style="user-select: auto;">(c, d)</code> is defined as <code style="user-select: auto;">(a * b) - (c * d)</code>.</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">For example, the product difference between <code style="user-select: auto;">(5, 6)</code> and <code style="user-select: auto;">(2, 7)</code> is <code style="user-select: auto;">(5 * 6) - (2 * 7) = 16</code>.</li>
</ul>

<p style="user-select: auto;">Given an integer array <code style="user-select: auto;">nums</code>, choose four <strong style="user-select: auto;">distinct</strong> indices <code style="user-select: auto;">w</code>, <code style="user-select: auto;">x</code>, <code style="user-select: auto;">y</code>, and <code style="user-select: auto;">z</code> such that the <strong style="user-select: auto;">product difference</strong> between pairs <code style="user-select: auto;">(nums[w], nums[x])</code> and <code style="user-select: auto;">(nums[y], nums[z])</code> is <strong style="user-select: auto;">maximized</strong>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">maximum</strong> such product difference</em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [5,6,2,7,4]
<strong style="user-select: auto;">Output:</strong> 34
<strong style="user-select: auto;">Explanation:</strong> We can choose indices 1 and 3 for the first pair (6, 7) and indices 2 and 4 for the second pair (2, 4).
The product difference is (6 * 7) - (2 * 4) = 34.
</pre>

<p style="user-select: auto;"><strong class="example" style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [4,2,5,9,7,4,8]
<strong style="user-select: auto;">Output:</strong> 64
<strong style="user-select: auto;">Explanation:</strong> We can choose indices 3 and 6 for the first pair (9, 8) and indices 1 and 5 for the second pair (2, 4).
The product difference is (9 * 8) - (2 * 4) = 64.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">4 &lt;= nums.length &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums[i] &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
</ul></div>