package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum TipoPagamento {
            DEBITO{
                @Override
                public double calcularDesconto(double valor) {
                    return valor * 0.1;
                }
            },CREDITO{
                @Override
                public double calcularDesconto(double valor) {
                    return valor * 0.5;
                }
            };

            public abstract double calcularDesconto(double valor);

}
