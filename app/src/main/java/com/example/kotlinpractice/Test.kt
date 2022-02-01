class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 45
        for (i in 0 until numbers.size) {
            answer -= numbers[i]
        }
        return answer
    }
}

fun main(args: Array<String>) {
    val sol = Solution()
    val absol = intArrayOf(1,2,3,4,6,7,8,0)
    var answer = sol.solution(absol)
    print(answer)
}
