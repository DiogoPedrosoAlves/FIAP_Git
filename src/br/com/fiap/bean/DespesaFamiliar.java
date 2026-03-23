// 570024 Diogo Pedroso Alves
// 569335 Samuel Pedroso Xavier

package br.com.fiap.bean;

public class DespesaFamiliar {
    public double rendaFamiliar, gastoComLuz, gastoComAgua, gastoComInternet, valorMensalidadeDaAcademia;
    public int numeroDeMoradores;

    public double calcularTotalDeDespesas() {
        double despesaTotal;
        despesaTotal = gastoComAgua + gastoComLuz + gastoComInternet + (valorMensalidadeDaAcademia * numeroDeMoradores);
        return despesaTotal;
    }
    public double calcularRendaFamiliarLiquida() {
        double rendaLiquida;
        rendaLiquida = rendaFamiliar - calcularTotalDeDespesas();
        return rendaLiquida;
    }
}
