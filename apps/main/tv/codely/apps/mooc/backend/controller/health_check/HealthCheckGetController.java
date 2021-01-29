package tv.codely.apps.mooc.backend.controller.health_check;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tv.codely.shared.domain.DomainError;
import tv.codely.shared.domain.bus.command.CommandBus;
import tv.codely.shared.domain.bus.query.QueryBus;
import tv.codely.shared.infrastructure.spring.ApiController;

import java.util.HashMap;

@RestController
public final class HealthCheckGetController extends ApiController {
    public HealthCheckGetController(
        QueryBus queryBus,
        CommandBus commandBus
    ) {
        super(queryBus, commandBus);
    }

    @GetMapping("/health-check")
    public HashMap<String, String> index() {
        Logger logger = LogManager.getLogger("rallibau");
        RuntimeException error = new RuntimeException("exceptioooon");
        logger.error("hola mon",error);
        HashMap<String, String> status = new HashMap<>();
        status.put("application", "mooc_backend");
        status.put("status", "ok");

        return status;
    }

    @Override
    public HashMap<Class<? extends DomainError>, HttpStatus> errorMapping() {
        return null;
    }
}
