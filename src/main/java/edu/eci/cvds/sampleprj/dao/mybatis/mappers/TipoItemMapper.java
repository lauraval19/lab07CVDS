package edu.eci.cvds.sampleprj.dao.mybatis.mappers;


import java.util.List;

import edu.eci.cvds.samples.entities.TipoItem;
/**
 *
 * @author Jaime Castro - Laura Alvarado
 */
public interface TipoItemMapper {
    
    
    public List<TipoItem> getTiposItems();
    
    public TipoItem getTipoItem(int id);
    
    public void addTipoItem(String des);

}
