package cv.api.openapis_dev.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class KeepAliveJob {

    private static final Logger log = LoggerFactory.getLogger(KeepAliveJob.class);
    
    private final RestTemplate restTemplate = new RestTemplate();

    @Scheduled(fixedRate = 600000) // 10 minutos
    public void keepAlive() {
        try {
            String url = "https://open-api-cv-1.onrender.com/api/geografia/nacionalidade";
            restTemplate.getForObject(url, String.class);
            log.info("Ping enviado com sucesso");
        } catch (Exception e) {
            log.error("Erro ao enviar ping", e);
        }
    }
}

