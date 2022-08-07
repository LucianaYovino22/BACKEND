
package com.portfolio.LuYovino.Service;

import com.portfolio.LuYovino.Entity.Proyectos;
import com.portfolio.LuYovino.Repository.Rproyectos;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SProyectos {
    @Autowired
    Rproyectos rProyectos;

    public List<Proyectos> list() {
        return rProyectos.findAll();
    }

    public Optional<Proyectos> getOne(int id) {
        return rProyectos.findById(id);
    }
    
   public Optional <Proyectos> getByNombrePro(String nombrePro){
       return rProyectos.findByNombrePro(nombrePro);
   }
   
   public void save(Proyectos pro) {
       rProyectos.save(pro);
   }
   
   public void delete(int id){
       rProyectos.deleteById(id);
   }
   
   public boolean existsById(int id){
       return rProyectos.existsById(id);
   }
   
   public boolean existsByNombrePro(String nombrePro){
       return rProyectos.existsByNombrePro(nombrePro);
   }
}