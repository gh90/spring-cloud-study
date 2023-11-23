package dev.gh90;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) {
        String rsaKeyFilePath = "key/id_rsa";
        Path current = Paths.get("");
        Path absolutePath = current.resolve(rsaKeyFilePath);

        String rsaKey;
        try {
            rsaKey = Files.lines(absolutePath)
                    .collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.setProperty("spring.cloud.config.server.git.privateKey",rsaKey);
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
