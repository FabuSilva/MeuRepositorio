// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(var nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String,val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("O usuário ${usuario.nome} foi matriculado na formação $nome.")
    }
}

fun main() {
    // Criação de conteúdos educacionais
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 120)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos em Kotlin", 180)
    val conteudo3 = ConteudoEducacional("Tópicos Avançados em Kotlin", 240)

    // Criação de uma formação
    val formacaoKotlin = Formacao("Formação Kotlin", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2, conteudo3))

    // Criação de usuários
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")

    // Matricular usuários na formação
    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)

    // Exibir lista de inscritos na formação
    println("Inscritos na formação ${formacaoKotlin.nome}:")
    for (usuario in formacaoKotlin.inscritos) {
        println("- ${usuario.nome}")
    }
}
