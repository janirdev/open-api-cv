package cv.api.openapis_dev.infrastruture.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cv.api.openapis_dev.infrastruture.entity.VGeograficaEntity;

@Repository
public interface JpaGegraficaRepository extends JpaRepository<VGeograficaEntity, Long>{

      @Query("""
        SELECT v FROM VGeograficaEntity v
        WHERE ((:idPai IS NULL and v.idIlha is null and v.idConcelho IS NULL and v.idZona IS NULL and v.idFreguesia IS NULL) OR 
               ( :tipo = 'PAIS' AND v.idPais IS NULL ) OR
               ( :tipo = 'ILHA' AND v.idPais = :idPai AND v.idIlha IS NULL ) OR
               ( :tipo = 'CONCELHO' AND v.idIlha = :idPai AND v.idConcelho IS NULL ) OR
               ( :tipo = 'ZONA' AND v.idConcelho = :idPai AND v.idZona IS NULL ) OR
               ( :tipo = 'FREGUESIA' AND v.idIlha = :idPai AND v.idFreguesia IS NULL )
              )
            ORDER BY v.localidade
        """)
        List<VGeograficaEntity> getLocalidades(@Param("tipo") String tipo, @Param("idPai") String idPai);


        @Query("""
                SELECT v FROM VGeograficaEntity v WHERE  idLocalidade = :idLocalidade
        """)
        VGeograficaEntity getByIdLocalidade(@Param("idLocalidade") String idLocalidade);
    
}
