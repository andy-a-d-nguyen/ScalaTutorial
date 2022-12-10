object LexicalScopes {
    def scopeRules(): Unit = {
        val x = 0

        def incrementByOne(y: Int) = y + 1

        val result = {
            val x = incrementByOne(3)
            x * x
        } + x

        println(result)
    }

    def main(args: Array[String]): Unit = {
        scopeRules()
    }
}