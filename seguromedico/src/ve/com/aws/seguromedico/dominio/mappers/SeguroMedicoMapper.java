package ve.com.aws.seguromedico.dominio.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ve.com.aws.seguromedico.dominio.SeguroMedico;
import ve.com.aws.seguromedico.dominio.Sexo;


public class SeguroMedicoMapper implements RowMapper<SeguroMedico> {

	public SeguroMedico mapRow(ResultSet rs, int rowNum) throws SQLException {
		SeguroMedico seguroMedico = new SeguroMedico();

		seguroMedico.setIdSeguro(rs.getInt("idSeguroMedico"));
		seguroMedico.setRif(rs.getString("rif"));
		seguroMedico.setNombre(rs.getString("nombre"));
		seguroMedico.setApellido(rs.getString("apellido"));
		seguroMedico.setEdad(rs.getInt("edad"));
		seguroMedico.setSexo(Sexo.valueOf(rs.getString("sexo")));
		seguroMedico.setCasado(rs.getBoolean("casado"));
		seguroMedico.setNumHijos(rs.getInt("numhijos"));
		seguroMedico.setEmbarazada(rs.getBoolean("embarazada"));
		seguroMedico.getCobertura().setOftalmologia(rs.getBoolean("coberturaoftalmologica"));
		seguroMedico.getCobertura().setDental(rs.getBoolean("coberturadental"));
		seguroMedico.getCobertura().setFecundacionInVitro(rs.getBoolean("coberturafecundacioninvitro"));

		seguroMedico.getEnfermedad().setCorazon(rs.getBoolean("enfermedadcorazon"));
		seguroMedico.getEnfermedad().setEstomacal(rs.getBoolean("enfermedadestomacal"));
		seguroMedico.getEnfermedad().setRinyones(rs.getBoolean("enfermedadrinyones"));
		seguroMedico.getEnfermedad().setAlergia(rs.getBoolean("enfermedadalergia"));
		seguroMedico.getEnfermedad().setNombreAlergia(rs.getString("nombrealergia"));

		return seguroMedico;
	}

}