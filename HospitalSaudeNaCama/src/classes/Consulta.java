package classes;

import classes.Paciente;
import classes.Medico;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private int codigo;
    private LocalDateTime dataHora;

    public Consulta() {
    }        
    
    public Consulta(Paciente paciente, Medico medico, int codigo, LocalDateTime dataHora) {
        this.paciente = paciente;
        this.medico = medico;
        this.codigo = codigo;
        this.dataHora = dataHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    
    
}
