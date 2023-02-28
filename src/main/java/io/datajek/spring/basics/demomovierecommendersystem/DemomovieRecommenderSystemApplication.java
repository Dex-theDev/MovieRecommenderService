package io.datajek.spring.basics.demomovierecommendersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DemomovieRecommenderSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemomovieRecommenderSystemApplication.class, args);
		RecommenderImplementation recommender = new RecommenderImplementation();
		String[] results = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(results));

	}

}
