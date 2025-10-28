
import java.util.HashMap;
import java.util.List;

public class Paciente extends Persona{

    private HashMap<String, String> historialMedico;
    private List<String> alergias;
    private String tipoSangre;

    public Paciente() {
    }

    public Paciente(int id, String nombre, int edad, String contacto, HashMap<String, String> historialMedico,
            List<String> alergias, String tipoSangre) {
        super(id, nombre, edad, contacto);
        this.historialMedico = historialMedico;
        this.alergias = alergias;
        this.tipoSangre = tipoSangre;
    }
    public HashMap<String, String> getHistorialMedico() {
        return historialMedico;
    }
    public void setHistorialMedico(HashMap<String, String> historialMedico) {
        this.historialMedico = historialMedico;
    }
    public List<String> getAlergias() {
        return alergias;
    }
    public void setAlergias(List<String> alergias) {
        this.alergias = alergias;
    }
    public String getTipoSangre() {
        return tipoSangre;
    }
    public void setTipoSangre(String tipoSangre) {
        if(validarTexto(tipoSangre)){
        this.tipoSangre = tipoSangre;
        }
        
    }
    @Override
    public String mostrarInformacion() {

    }

    

}
