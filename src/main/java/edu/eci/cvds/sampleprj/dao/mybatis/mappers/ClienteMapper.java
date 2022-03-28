package edu.eci.cvds.sampleprj.dao.mybatis.mappers;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.samples.entities.Cliente;

/**
 *
 * @author Jaime Castro - Laura Alvarado
 */
public interface ClienteMapper {

    public Cliente consultarCliente(@Param("idcli") int id);

    /**
     * Registrar un nuevo item rentado asociado al cliente identificado
     * con 'idc' y relacionado con el item identificado con 'idi'
     * @param id
     * @param idit
     * @param fechainicio
     * @param fechafin
     */
    public void agregarItemRentadoACliente(@Param("idcli")int id,
                                           @Param("iditr")int idit,
                                           @Param("fini")Date fechainicio,
                                           @Param("ffin")Date fechafin);

    /**
     * Consultar todos los clientes
     * @return
     */
    public List<Cliente> consultarClientes();

}

