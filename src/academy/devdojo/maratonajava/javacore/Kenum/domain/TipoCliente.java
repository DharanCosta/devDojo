package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum TipoCliente {
    PESSOA_FISICA(1,"Pessoa Física"),
    PESSOA_JURIDICA(2,"Pessoa Juridica");

    private int value;
    private String nomeRelatorio;
    TipoCliente(int value,String nomeRelatorio) {
        this.value = value;
        this.nomeRelatorio= nomeRelatorio;
    }

    public static TipoCliente tipoClientePorNomeRelatori(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()) {
            if(tipoCliente.getNomeRelatorio().equals((nomeRelatorio))){
                return tipoCliente;
            }
        } return null;

    }

    public int getValue() {
        return value;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}

