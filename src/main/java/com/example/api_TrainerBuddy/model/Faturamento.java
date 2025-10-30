package com.example.api_TrainerBuddy.model;
import jakarta.persistence.*;

@Entity
@Table(name = "Faturamento", schema = "cl203013")
public class Faturamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_faturamento", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_Usuario", nullable = false)
    private int usuario;

    @ManyToOne
    @JoinColumn(name = "id_Plano", nullable = false)
    private int plano;

    @Column(name = "vencimento", length = 45, nullable = false)
    private String vencimento;

    @Column(name = "data_compra", length = 45, nullable = false)
    private String dataCompra;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getPlano() {
        return plano;
    }

    public void setPlano(int plano) {
        this.plano = plano;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
}
