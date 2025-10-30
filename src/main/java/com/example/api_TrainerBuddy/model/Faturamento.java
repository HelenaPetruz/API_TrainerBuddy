package com.example.api_TrainerBuddy.model;
import jakarta.persistence.*;

@Entity
@Table(name = "`Faturamento`", schema = "cl203013") //ESTÁ dando ERRO
public class Faturamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_faturamento", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_Usuario", nullable = false)
    private Pessoa usuario;

    @ManyToOne
    @JoinColumn(name = "id_Plano", nullable = false)
    private Plano plano;

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

    public Pessoa getUsuario() {
        return usuario;
    }

    public void setUsuario(Pessoa usuario) {
        this.usuario = usuario;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
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
