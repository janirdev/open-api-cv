package cv.api.openapis_dev.application.geografica.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cv.api.openapis_dev.application.geografica.dto.ComboboxDto;
import cv.api.openapis_dev.application.geografica.dto.LocalidadeDto;
import cv.api.openapis_dev.application.geografica.enums.TypeGeografia;
import cv.api.openapis_dev.domain.geografia.GeografiaBus;
import lombok.*;

@Service
@AllArgsConstructor
public class GeografiaServiceImpl implements GeografiaService {

     private final GeografiaBus geografiaBus; 

     @Override
     public List<ComboboxDto> getNacionalidade(){
        return geografiaBus.getNacionalidade();
     }

     @Override
     public List<ComboboxDto> getLocalidadeByPai(TypeGeografia tipo, String idPai){
         return geografiaBus.getLocalidadeByPai(tipo.getDescription(), idPai);
     }

     public LocalidadeDto getDetalheLocalidade(String idLocalidade){
        return geografiaBus.getDetalheLocalidade(idLocalidade);
     }
}
