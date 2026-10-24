
package pe.edu.cibertec.configservertransporte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerTransporteApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerTransporteApplication.class, args);
    }
}
