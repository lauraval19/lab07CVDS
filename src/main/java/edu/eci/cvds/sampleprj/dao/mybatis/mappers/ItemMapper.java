package edu.eci.cvds.sampleprj.dao.mybatis.mappers;


import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.samples.entities.Item;

/**
 *
 * @author Jaime Castro - Laura Alvarado
 */
public interface ItemMapper {


    public List<Item> consultarItems();

    public Item consultarItem(@Param("idit")int id);

    public void insertarItem(@Param("item")Item it);


}
