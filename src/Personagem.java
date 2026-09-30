public abstract class Personagem implements Combatente {
    protected String nome;
    protected int vidaAtual;
    protected int vidaMaxima;
    protected int poderBase;

    public Personagem(String nome, int vidaMaxima, int poderBase) {
        this.nome = nome;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaMaxima;
        this.poderBase = poderBase;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    @Override
    public void atacar(Combatente alvo) {
        int dano = calcularDanoAtaque();
        IO.println("%s ataca %s causando %d de dano!\n", nome, alvo.getNome(), dano);
        alvo.receberDano(dano);
    }

    @Override
    public void receberDano(int dano) {
        this.vidaAtual = Math.max(0, this.vidaAtual - dano);
    }

    public abstract int calcularDanoAtaque();

}
