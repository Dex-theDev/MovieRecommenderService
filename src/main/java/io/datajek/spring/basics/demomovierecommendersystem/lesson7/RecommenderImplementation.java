package io.datajek.spring.basics.demomovierecommendersystem.lesson7;

import io.datajek.spring.basics.demomovierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    //use filter interface to select Filter
   // @Autowired
    @Qualifier("CF")
    private Filter filter;

    //constructor to initialize the filter
    @Autowired
    public RecommenderImplementation(@Qualifier("collaborativeFilter")Filter filter){
        this.filter = filter;
        System.out.println("Constructor invoked ..");
    }
    public String[] recommendMovies(String movie){

        System.out.println("Name of current filter " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }
}
