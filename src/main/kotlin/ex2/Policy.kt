package ex2

data class Policy(val lower: Int, val upper: Int, val match: Char, val content: String) {

    fun isValidA(): Boolean {
        val occurrences = content.count {
            it == match
        }

        return (lower..upper).contains(occurrences)
    }

    fun isValidB(): Boolean {
        val lowerMatch = content[lower - 1] == match
        val upperMatch = content[upper - 1] == match
        return lowerMatch xor upperMatch
    }
}