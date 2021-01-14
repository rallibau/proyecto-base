package tv.codely.apps.backoffice.frontend;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import tv.codely.shared.domain.Service;

import java.util.HashMap;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@ComponentScan(
    includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Service.class),
    value = {
        BackofficeFrontendApplication.TV_CODELY_SHARED,
        BackofficeFrontendApplication.TV_CODELY_BACKOFFICE,
        BackofficeFrontendApplication.TV_CODELY_MOOC,
        BackofficeFrontendApplication.TV_CODELY_APPS_BACKOFFICE_FRONTEND
    }
)
public class BackofficeFrontendApplication {

    public static final String TV_CODELY_SHARED = "tv.codely.shared";
    public static final String TV_CODELY_BACKOFFICE = "tv.codely.backoffice";
    public static final String TV_CODELY_MOOC = "tv.codely.mooc";
    public static final String TV_CODELY_APPS_BACKOFFICE_FRONTEND = "tv.codely.apps.backoffice.frontend";

    public static HashMap<String, Class<?>> commands() {
        return new HashMap<String, Class<?>>() {{
        }};
    }
}
