package ve.com.aws.seguromedico.persistencia.implementacion;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import ve.com.aws.seguromedico.dominio.SeguroMedico;
import ve.com.aws.seguromedico.dominio.mappers.SeguroMedicoMapper;
import ve.com.aws.seguromedico.persistencia.ISeguroMedicoDAO;
import ve.com.aws.seguromedico.persistencia.excepcion.SeguroMedicoException;

public class SeguroMedicoDAOImpl implements ISeguroMedicoDAO {

	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	private ApplicationContext context;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public SeguroMedicoDAOImpl getSeguroMedicoDAOImpl() {
		context = new ClassPathXmlApplicationContext("jdbc-config.xml");
		return (SeguroMedicoDAOImpl) context.getBean("seguroMedicoDAO");
	}

	@Override
	public void insert(SeguroMedico seguroMedico) throws SeguroMedicoException {
		jdbcTemplate = new JdbcTemplate(dataSource);
		try {

			String sql = "INSERT INTO seguromedico (rif, nombre, apellido, edad, sexo, casado, numhijos, embarazada, coberturaoftalmologica, coberturadental, coberturafecundacioninvitro, enfermedadcorazon, enfermedadestomacal, enfermedadrinyones, enfermedadalergia, nombrealergia) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			Object parametros[] = { seguroMedico.getRif(), seguroMedico.getNombre(), seguroMedico.getApellido(),
					seguroMedico.getEdad(), seguroMedico.getSexo().name(), seguroMedico.isCasado(),
					seguroMedico.getNumHijos(), seguroMedico.isEmbarazada(),
					seguroMedico.getCobertura().isOftalmologia(), seguroMedico.getCobertura().isDental(),
					seguroMedico.getCobertura().isFecundacionInVitro(), seguroMedico.getEnfermedad().isCorazon(),
					seguroMedico.getEnfermedad().isEstomacal(), seguroMedico.getEnfermedad().isRinyones(),
					seguroMedico.getEnfermedad().isAlergia(), seguroMedico.getEnfermedad().getNombreAlergia() };

			jdbcTemplate.update(sql, parametros);

		} catch (DataAccessException ex) {
			throw new RuntimeException(ex);
		} finally {

		}

	}

	@Override
	public void update(int idSeguroMedico, SeguroMedico seguroMedico) throws SeguroMedicoException {
		jdbcTemplate = new JdbcTemplate(dataSource);
		try {
			String sql = "UPDATE seguromedico SET rif=?, nombre=?, apellido=?, edad=?, sexo=?, casado=?, numhijos=?, embarazada=?, coberturaoftalmologica=?, coberturadental=?, coberturafecundacioninvitro=?, enfermedadcorazon=?, enfermedadestomacal=?, enfermedadrinyones=?, enfermedadalergia=?, nombrealergia=? WHERE IdSeguroMedico=?";

			Object parametros[] = { seguroMedico.getRif(), seguroMedico.getNombre(), seguroMedico.getApellido(),
					seguroMedico.getEdad(), seguroMedico.getSexo().name(), seguroMedico.isCasado(),
					seguroMedico.getNumHijos(), seguroMedico.isEmbarazada(),
					seguroMedico.getCobertura().isOftalmologia(), seguroMedico.getCobertura().isDental(),
					seguroMedico.getCobertura().isFecundacionInVitro(), seguroMedico.getEnfermedad().isCorazon(),
					seguroMedico.getEnfermedad().isEstomacal(), seguroMedico.getEnfermedad().isRinyones(),
					seguroMedico.getEnfermedad().isAlergia(), seguroMedico.getEnfermedad().getNombreAlergia(),
					idSeguroMedico };

			jdbcTemplate.update(sql, parametros);
		} catch (DataAccessException ex) {
			throw new RuntimeException(ex);
		} finally {

		}
	}

	@Override
	public SeguroMedico get(int idSeguroMedico) throws SeguroMedicoException {
		SeguroMedico seguroMedico;
		jdbcTemplate = new JdbcTemplate(dataSource);
		try {
			String sql = "SELECT * FROM SeguroMedico WHERE idSeguroMedico=?";

			Object parametros[] = { idSeguroMedico };

			seguroMedico = jdbcTemplate.queryForObject(sql, parametros, new SeguroMedicoMapper());

		} catch (DataAccessException ex) {
			throw new RuntimeException(ex);
		} finally {

		}
		return seguroMedico;
	}

	@Override
	public void delete(int idSeguroMedico) throws SeguroMedicoException {
		jdbcTemplate = new JdbcTemplate(dataSource);
		try {

			String sql = "DELETE FROM SeguroMedico WHERE idSeguroMedico=?";

			Object parametros[] = { idSeguroMedico };

			jdbcTemplate.update(sql, parametros);

		} catch (DataAccessException ex) {
			throw new RuntimeException(ex);
		} finally {

		}

	}

	@Override
	public List<SeguroMedico> findAll() throws SeguroMedicoException {
		jdbcTemplate = new JdbcTemplate(dataSource);
		List<SeguroMedico> segurosMedicos = new ArrayList<>();

		try {
			String sql = "SELECT * FROM SeguroMedico";
			segurosMedicos = jdbcTemplate.query(sql, new SeguroMedicoMapper());

			return segurosMedicos;
		} catch (DataAccessException ex) {
			throw new RuntimeException(ex);
		} finally {

		}
	}
}