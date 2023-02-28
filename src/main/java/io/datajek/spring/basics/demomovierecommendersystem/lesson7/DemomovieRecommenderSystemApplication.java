package io.datajek.spring.basics.demomovierecommendersystem.lesson7;

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
//		System.out.println("Calling getBean() on RecommenderImplementation");
//		io.datajek.spring.basics.demomovierecommendersystem.lesson7.RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

		//RecommenderImplementation2 injects dependency using setter method
		System.out.println("Calling getBean() on RecommenderImplementation2");
		RecommenderImplementation2 recommender2 = appContext.getBean(RecommenderImplementation2.class);
		//call method to get recommendations
		String[] result = recommender2.recommendMovies("Finding Dory");

		System.out.println(Arrays.toString(result));
	}

}
