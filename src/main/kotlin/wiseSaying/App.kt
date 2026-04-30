package wiseSaying

class App{
    fun run(){
        println("== 명언 앱 ==")
        var lastId = 0
        val wiseSayings = mutableListOf<wiseSaying>()

        while (true) {
            print("명령) ")
            val input = readln()

            when (input) {
                "종료" -> {
                    println("프로그램을 종료합니다")
                    break
                }
                "등록" -> {
                    print("명언: ")
                    val content = readln()
                    print("작가: ")
                    val author = readln()
                    val id = ++lastId

                    wiseSaying(id, content, author)
                        .also { wiseSayings.add(it) }

                    println("${id}번 명언이 등록되었습니다")
                }

                "목록"->{
                    println("번호 / 작가 / 내용")
                    println("-".repeat(30))
                    wiseSayings.reversed().forEach{
                        println("${it.id} / ${it.author} / ${it.content}")
                    }
                }

            }
        }
    }
}