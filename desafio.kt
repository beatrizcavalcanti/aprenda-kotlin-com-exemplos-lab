// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { NOOB, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String, val nivel: Nivel)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        if (!inscritos.contains(usuario)) {
            inscritos.add(usuario)
            
        } else {
            println("Usuário já está matriculado nesta formação.")
        }
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 120)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos em Kotlin")
    val conteudo3 = ConteudoEducacional("Coroutines em Kotlin", 90)

    val formacao1 = Formacao("Desenvolvimento Kotlin Básico", Nivel.NOOB, listOf(conteudo1, conteudo2))
    val formacao2 = Formacao("Desenvolvimento Kotlin Avançado", Nivel.AVANCADO, listOf(conteudo2, conteudo3))

    val usuario1 = Usuario("Alice", Nivel.INTERMEDIARIO)
    val usuario2 = Usuario("Bob", Nivel.NOOB)

    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)
    formacao2.matricular(usuario1)

    // Teste de saída de dados
    println("Formação: ${formacao1.nome}, Nível: ${formacao1.nivel}")
    println("Conteúdos: ${formacao1.conteudos}")
    println("Inscritos: ${formacao1.inscritos}")

    println("\nFormação: ${formacao2.nome}, Nível: ${formacao2.nivel}")
    println("Conteúdos: ${formacao2.conteudos}")
    println("Inscritos: ${formacao2.inscritos}")

   
}
