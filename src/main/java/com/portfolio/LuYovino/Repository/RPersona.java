
package com.portfolio.LuYovino.Repository;
import com.portfolio.LuYovino.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RPersona extends JpaRepository<Persona,Integer>{
    public Optional<Persona> findByNombreP(String nombreP);
    public boolean existsByNombreP(String nombreP);
}