public enum Fraqueza {
    PICADA_INSETO("Picada de Inseto"),
    CALOR_EXTREMO("Calor Extremo"),
    RUBI("Pedra Especial do Jogo"),
    VELOCIDADE_ADRENALINA("Velocidade e Adrenalina"),
    FRIO_EXTREMO("Frio Extremo"),
    FAMILIA_AMEACADA("Ameaça à Família"),
    AMENDOIM("Comidas com Amendoim");

    private final String descricao;

    Fraqueza(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

}
