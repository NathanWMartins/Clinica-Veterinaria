package classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Medico {
    private String nome;
    private String cpf;
    private int telefone;
    private String endereco;
    private int crm;
    private String especialidade;
    private LinkedList<LocalDateTime> listaHorarios = new LinkedList<>();

    public Medico() {
    }
    
    
    
    public Medico(String nome, String cpf, int telefone, String endereco, int crm, String especialidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.crm = crm;
        this.especialidade = especialidade;
        adicionarHorarios();
    }

    public void adicionarHorarios(){
        listaHorarios.add(LocalDateTime.of(2023, 12, 20, 8, 0));
        listaHorarios.add(LocalDateTime.of(2023, 12, 20, 10, 0));
        listaHorarios.add(LocalDateTime.of(2023, 12, 20, 14, 0));
        listaHorarios.add(LocalDateTime.of(2023, 12, 20, 16, 0));
    }
    
    public void addHorario(LocalDateTime dataHorario){
        listaHorarios.add(dataHorario);    
        Collections.sort(listaHorarios, Comparator.comparing(LocalDateTime::getHour));
    }
    
    public void removerHorario(LocalDateTime dataHorario){
        for (int i = 0; i < listaHorarios.size(); i++) {
            if (dataHorario.isEqual(listaHorarios.get(i))) {
                listaHorarios.remove(i);
                break;
            }
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public LinkedList<LocalDateTime> getListaHorarios() {
        return listaHorarios;
    }

    public void setListaHorarios(LocalDateTime horario) {
        this.listaHorarios.add(horario);
    }
    
    
    
}
