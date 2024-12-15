package com.ranma2913.fbphotodownloader

import groovy.util.logging.Slf4j
import org.apache.commons.cli.Options
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@Slf4j
@SpringBootApplication
class FbPhotoDownloaderApplication implements CommandLineRunner {

    // Method 1
    // run() method for springBootApplication to execute
    @Override
    void run(String... args) throws Exception {
        log.info("FbPhotoDownloaderApplication args = {}", args)

        Options options = new Options()
        options.addOption("h", "help", false, "Print help message")
        options.addOption("f", "file", true, "Input file")

    }

    // Method 2
    // Main driver method
    static void main(String[] args) {
        // Calling run() method to execute SpringBootApplication by
        // invoking run() inside main() method
        SpringApplication.run(FbPhotoDownloaderApplication.class, args)
    }
}
