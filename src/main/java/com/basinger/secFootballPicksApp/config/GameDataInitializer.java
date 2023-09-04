package com.basinger.secFootballPicksApp.config;

import com.basinger.secFootballPicksApp.model.Game;
import com.basinger.secFootballPicksApp.repos.GameRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameDataInitializer {

    @Bean
    public CommandLineRunner initializeGameData(GameRepository gameRepository) {
        return args -> {
            if (gameRepository.count() == 0) {
                gameRepository.save(new Game(null, 1, "Alabama", "MTSU"));
                gameRepository.save(new Game(null, 1, "Arkansas", "WCU"));
                gameRepository.save(new Game(null, 1, "Auburn", "UMASS"));
                gameRepository.save(new Game(null, 1, "Florida", "Utah"));
                gameRepository.save(new Game(null, 1, "Georgia", "UT Martin"));
                gameRepository.save(new Game(null, 1, "Kentucky", "Ball State"));
                gameRepository.save(new Game(null, 1, "LSU", "Florida State"));
                gameRepository.save(new Game(null, 1, "MSU", "SE Louisiana"));
                gameRepository.save(new Game(null, 1, "Missouri", "South Dakota"));
                gameRepository.save(new Game(null, 1, "Ole Miss", "Mercer"));
                gameRepository.save(new Game(null, 1, "South Carolina", "UNC"));
                gameRepository.save(new Game(null, 1, "Tennessee", "Virginia"));
                gameRepository.save(new Game(null, 1, "Texas A&M", "New Mexico"));
                gameRepository.save(new Game(null, 1, "Vanderbilt", "Alabama A&M"));
            }
        };
    }
}

