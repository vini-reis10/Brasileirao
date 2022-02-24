class Campeonato(
    val nome: String,
    val ano: Short
) {
    private var clubes = mutableListOf<Clube>()

    fun cadastrarNovoClube(clube: Clube): Boolean = clubes.add(clube)

    fun listarTodosOsClubes() = clubes

    fun listarClubesPorSerie(serie: Serie) = clubes.filter { c -> c.serie == serie }

    fun buscarClubePeloNome(nome: String) = clubes.first{c -> c.nome.equals(nome,true)}
}