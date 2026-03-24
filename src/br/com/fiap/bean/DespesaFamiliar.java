// 570024 Diogo Pedroso Alves
// 569335 Samuel Pedroso Xavier

package br.com.fiap.bean;

public class DespesaFamiliar {
    public double rendaFamiliar, gastoComLuz, gastoComAgua, gastoComInternet, valorMensalidadeDaAcademia;
    public int numeroDeMoradores;

    public double calcularTotalDeDespesas() {
        double despesaAcademia;
        despesaAcademia = valorMensalidadeDaAcademia * numeroDeMoradores;
        return gastoComAgua + gastoComLuz + gastoComInternet + despesaAcademia;
    }
    public double calcularRendaFamiliarLiquida() {
        return rendaFamiliar - calcularTotalDeDespesas();
    }
}
