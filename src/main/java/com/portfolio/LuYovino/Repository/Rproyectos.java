
package com.portfolio.LuYovino.Repository;
import com.portfolio.LuYovino.Entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Rproyectos extends JpaRepository<Proyectos, Integer>{
    public Optional <Proyectos> findByNombrePro(String nombrePro);
    public boolean existsByNombrePro(String nombrePro);
    
}