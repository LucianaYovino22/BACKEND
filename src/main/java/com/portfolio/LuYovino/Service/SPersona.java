
package com.portfolio.LuYovino.Service;

import com.portfolio.LuYovino.Entity.Persona;
import com.portfolio.LuYovino.Repository.RPersona;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class SPersona {
    @Autowired
    RPersona rPersona;
    
    public List <Persona> list(){
        return rPersona.findAll();
    }
    
    public Optional<Persona> getOne (int id){
        return rPersona.findById(id);
    }
    
    public Optional<Persona> getByNombreP(String nompreP){
        return rPersona.findByNombreP(nompreP);
    }
    
    public void save (Persona persona){
        rPersona.save(persona);
    }
    
    public boolean existsById(int id){
        return rPersona.existsById(id);
    }
     public void delete(int id){
        rPersona.deleteById(id);
    }
    
    public boolean existsByNombreP(String nombreP){
        return rPersona.existsByNombreP(nombreP);
    }
}