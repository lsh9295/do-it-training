class Solution {
    fun solution(n: Int): Int {
        var answer : String = "0"
        var num = n
        while (num > 0) {
            answer = ((num % 3) + answer.toInt()).toString()
            num /= 3
        }
        return answer.toInt()
    }
}

fun main(args: Array<String>) {
    val sol = Solution()
    val a = 45
    var answer = sol.solution(a)

    print("${answer} ")

}
