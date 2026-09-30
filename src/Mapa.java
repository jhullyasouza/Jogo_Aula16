public record Mapa(String nomeFase, Fraqueza perigoAmbiental) {

    public String obterAvisoPerigo(){
        return "Atenção ao olhar o Mapa: " + perigoAmbiental.getDescricao();
    }

}
