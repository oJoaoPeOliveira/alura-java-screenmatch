import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Kraven");
        meuFilme.setAnoLancamento(2024);
        meuFilme.setDuracaoEmMinutos(127);
        meuFilme.setIncluidoNoPlano(true);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Média de avaliações do filme: " + meuFilme.pegaMedia());
        //System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        //System.out.println(meuFilme.pegaMedia());
        //System.out.println(meuFilme.nome);
        //System.out.println(meuFilme.anoLancamento);
        //br.com.alura.screenmatch.modelos.Filme é o modelo, mas o filme dentro dessa caixa é o meuFilme
        //br.com.alura.screenmatch.modelos.Filme.nome = "VAI DAR ERRO";
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Warcraft");
        outroFilme.setAnoLancamento(2016);
        outroFilme.setDuracaoEmMinutos(124);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisiualizacoes(300);
        filtro.filtra(episodio);
    }
}