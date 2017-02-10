package ve.com.aws.seguromedico.persistencia;

import java.util.List;

import ve.com.aws.seguromedico.dominio.SeguroMedico;
import ve.com.aws.seguromedico.persistencia.excepcion.SeguroMedicoException;

public interface ISeguroMedicoDAO {

	void insert(SeguroMedico seguroMedico) throws SeguroMedicoException;
    
    void update(int idSeguroMedico,SeguroMedico seguroMedico) throws SeguroMedicoException;

    SeguroMedico get(int idSeguroMedico) throws SeguroMedicoException;

    void delete(int idSeguroMedico) throws SeguroMedicoException;

    List<SeguroMedico> findAll() throws SeguroMedicoException;
}
