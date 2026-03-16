package cv.api.openapis_dev.application.geografica.service;

import java.util.List;

import cv.api.openapis_dev.application.geografica.dto.ComboboxDto;
import cv.api.openapis_dev.application.geografica.dto.LocalidadeDto;
import cv.api.openapis_dev.application.geografica.enums.TypeGeografia;

public interface GeografiaService {
      public List<ComboboxDto> getNacionalidade();
      public List<ComboboxDto> getLocalidadeByPai(TypeGeografia tipo, String idPai);
      public LocalidadeDto getDetalheLocalidade(String idLocalidade);
}
