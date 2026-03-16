package cv.api.openapis_dev.domain.geografia;

import java.util.List;

import cv.api.openapis_dev.application.geografica.dto.ComboboxDto;
import cv.api.openapis_dev.application.geografica.dto.LocalidadeDto;

public interface GeografiaBus {

    public List<ComboboxDto> getNacionalidade();

    public List<ComboboxDto> getLocalidadeByPai(String tipo, String idPai);

    public LocalidadeDto getDetalheLocalidade(String idLocalidade);
    
}
