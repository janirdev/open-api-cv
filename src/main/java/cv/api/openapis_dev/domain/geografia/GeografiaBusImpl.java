package cv.api.openapis_dev.domain.geografia;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import cv.api.openapis_dev.application.geografica.dto.ComboboxDto;
import cv.api.openapis_dev.application.geografica.enums.TypeGeografia;
import cv.api.openapis_dev.infrastruture.entity.VGeograficaEntity;
import cv.api.openapis_dev.infrastruture.repository.JpaGegraficaRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GeografiaBusImpl implements GeografiaBus{

     private final JpaGegraficaRepository jpaGegraficaRepository;

    @Override
    public List<ComboboxDto> getNacionalidade() {
        return jpaGegraficaRepository.getLocalidades(TypeGeografia.PAIS.getDescription(), null)
                                     .stream()
                                     .map(e -> new ComboboxDto(e.getLocalidade(), e.getIdLocalidade()))
                                     .collect(Collectors.toList());
    }

    @Override
    public List<ComboboxDto> getLocalidadeByPai(String tipo, String idPai) {
        return jpaGegraficaRepository.getLocalidades(tipo, idPai)
                                     .stream()
                                     .map(e -> new ComboboxDto(e.getLocalidade(), e.getIdLocalidade()))
                                     .collect(Collectors.toList());
    }
}
