package io.datajek.spring.basics.demomovierecommendersystem.lesson6;

import io.datajek.spring.basics.demomovierecommendersystem.lesson5.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DemomovieRecommenderSystemApplication {

	public static void main(String[] args) {
	//manages the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(DemomovieRecommenderSystemApplication.class, args);

		//use application context to find out which filter is being used
		io.datajek.spring.basics.demomovierecommendersystem.lesson6.RecommenderImplementation recommender = appContext.getBean(io.datajek.spring.basics.demomovierecommendersystem.lesson6.RecommenderImplementation.class);

		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

		System.out.println(Arrays.toString(result));
	}

}
