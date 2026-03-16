package cv.api.openapis_dev.web.geografia;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cv.api.openapis_dev.application.geografica.dto.ComboboxDto;
import cv.api.openapis_dev.application.geografica.dto.LocalidadeDto;
import cv.api.openapis_dev.application.geografica.service.GeografiaService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/geografia")
@RequiredArgsConstructor
public class GeografiaController {
    
    private final GeografiaService geografiaService;

    @GetMapping("/nacionalidade")
    @Operation(summary = "List all nationalities")
    public List<ComboboxDto> getNacionalidade(){
        return geografiaService.getNacionalidade();
    }

    @GetMapping("/localidade")
    @Operation(summary = "List of locations by type and parent ID")
    public List<ComboboxDto> getNacionalidade(@RequestParam("tipo") String tipo, @RequestParam("idPai") String idPai){
        return geografiaService.getLocalidadeByPai(tipo, idPai);
    }

    @GetMapping("/delalhe/{idLocalidade}")
    @Operation(summary = "Details of a location")
    public LocalidadeDto getNacionalidade(@RequestParam("idLocalidade") String idLocalidade){
        return geografiaService.getDetalheLocalidade(idLocalidade);
    }
}
